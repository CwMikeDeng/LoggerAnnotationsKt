package tw.mike.loggerprocessor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import tw.mike.loggerannotations.EventKey

class LoggerProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        logger.info("[LoggerProcessor start]")
        val loggerInterface = resolver.getSymbolsWithAnnotation(EventKey::class.qualifiedName!!)
            .filterIsInstance<KSFunctionDeclaration>()
            .groupBy { it.parentDeclaration?.simpleName?.asString() }

        loggerInterface.forEach { (interfaceName, functions) ->
            val file = codeGenerator.createNewFile(
                Dependencies.ALL_FILES,
                packageName = "tw.mike.loggerannotationskt",
                fileName = "LoggerImpl"
            )

            file.bufferedWriter().use { writer ->
                // TODO: 這個package要改
                writer.write("package tw.mike.loggerannotationskt\n\n")
                writer.write("import android.util.Log\n\n")
                writer.write("class LoggerImpl : $interfaceName {\n")

                for (func in functions) {
                    val eventName = func.annotations
                        .first { it.shortName.asString() == "EventKey" }
                        .arguments[0].value as String

                    val params = func.parameters.map {
                        val name = it.name?.asString()!!
                        val type = it.type.resolve().declaration.simpleName.asString()
                        val key =
                            it.annotations.first { ann -> ann.shortName.asString() == "ParamKey" }
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