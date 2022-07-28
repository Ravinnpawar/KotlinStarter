class InnerExample {
}
class Outers {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {

    val outer = Outers()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outers().Inner()
    println("Using inner object: ${inner.callMe()}")
}