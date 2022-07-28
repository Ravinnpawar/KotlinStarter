
class CompanionExample {
    companion object Test {
        fun callMe() = println("I'm called.")
    }
}

fun main(args: Array<String>) {
    CompanionExample.callMe()
}