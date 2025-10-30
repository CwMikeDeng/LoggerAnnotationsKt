package tw.mike.loggerprocessor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.Nullability
import tw.mike.loggerannotations.EventKey

class LoggerProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    companion object {
        /** 被生成出來的檔案所在路徑 */
        private const val BUILT_FILE_PATH = "tw.mike.loggerannotationskt"
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        logger.info("[LoggerProcessor start]")
        val loggerInterface = resolver.getSymbolsWithAnnotation(EventKey::class.qualifiedName!!)
            .filterIsInstance<KSFunctionDeclaration>()
            .groupBy { it.parentDeclaration?.simpleName?.asString() }

        loggerInterface.forEach { (interfaceName, functions) ->
            // 取得原始檔案路徑，用來加在import上
            val interfaceDecl = functions.firstOrNull()?.parentDeclaration as? KSClassDeclaration
            val packageName =
                interfaceDecl?.containingFile?.packageName?.asString() ?: BUILT_FILE_PATH

            val file = codeGenerator.createNewFile(
                Dependencies.ALL_FILES,
                packageName = BUILT_FILE_PATH,
                fileName = "${interfaceName}Impl"
            )

            file.bufferedWriter().use { writer ->
                writer.write(
                    """
                        package $BUILT_FILE_PATH
                        
                        import $packageName.$interfaceName
                        import android.util.Log
                        
                        class ${interfaceName}Impl : $interfaceName {
                        
                    """.trimIndent()
                )

                for (func in functions) {
                    val eventName = func.annotations
                        .first { it.shortName.asString() == "EventKey" }
                        .arguments[0].value as String

                    val params = func.parameters.map {
                        val name = it.name?.asString()!!
                        val resolvedType = it.type.resolve()
                        val baseType = resolvedType.declaration.simpleName.asString()
                        val type = if (resolvedType.nullability == Nullability.NULLABLE) "$baseType?" else baseType
                        val key = it.annotations
                            .first { ann -> ann.shortName.asString() == "ParamKey" }
                            .arguments[0].value as String
                        Triple(name, type, key)
                    }

                    val paramStr = params.joinToString(", ") { (name, type, _) -> "$name: $type" }

                    writer.write("    override fun ${func.simpleName.asString()}($paramStr) {\n")
                    for ((name, _, key) in params) {
                        writer.write("        Log.d(\"$eventName\", \"$key = \$$name\")\n")
                    }
                    writer.write("    }\n\n")
                }

                writer.write("}\n")
            }
        }

        return emptyList()
    }
}