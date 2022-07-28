class PrimaryWithInitBlock {
}
fun main(args: Array<String>) {
    val person1 = Information("joe", 25)
}

class Information(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    // initializer block
    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}