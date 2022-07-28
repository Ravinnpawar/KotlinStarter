//With Safe call ?.
/*fun main() {
    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call
  *//*  val p: String by lazy { // the value is computed only on first access
        // compute the string
    }*//*
}*/

//With Elvis Operator ?:
/*fun main(args: Array<String>) {
    var str : String? = "Kotlin Training"
    println(str?.length)
    str = null
    println(str?.length ?: "-1")
}*/

//Null Check !!
fun main(args: Array<String>) {
    var str1 : String? = null
    println(str1!!.length)
}
