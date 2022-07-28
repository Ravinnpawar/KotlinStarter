fun main(args: Array<String>) {

    val product = { a: Int, b: Int ,c:Int-> a * b*c }


    val result = product(9, 3,9)
    println("Result using Lambda Function"+result)

    //Greeting method calling
    val greeting = { println("Hello!")}
    greeting()
}