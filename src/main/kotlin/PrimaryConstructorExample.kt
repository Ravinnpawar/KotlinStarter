fun main(args: Array<String>) {

    val person1 = Info("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}

class Info(val firstName: String, var age: Int) {

}