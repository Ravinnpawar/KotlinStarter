
open class OverridingExample() {
    open fun displayAge(age: Int) {
        println("My age is $age.")
    }
}

class Girl: OverridingExample() {

    override fun displayAge(age: Int) {
        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = Girl()
    girl.displayAge(31)
}