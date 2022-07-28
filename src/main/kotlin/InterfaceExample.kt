
interface MyInterface {

    val test: Int

    fun foo() : String

    fun hello() {
        println("Hello there, pal!")
    }
}

class InterfaceExample : MyInterface {

    override val test: Int = 25
    override fun foo() = "Lol"

}

fun main(args: Array<String>) {
    val obj = InterfaceExample()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())
}
