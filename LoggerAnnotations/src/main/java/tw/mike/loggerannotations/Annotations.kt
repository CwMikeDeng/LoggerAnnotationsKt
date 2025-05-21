package tw.mike.loggerannotations

@Target(AnnotationTarget.FUNCTION)
annotation class EventKey(val value: String)

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class ParamKey(val value: String)