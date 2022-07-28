fun callMe(greeting: () -> Unit) {
    greeting()
}

fun main(args: Array<String>) {
    callMe({ println("Hello!") })
}

//Example: maxBy() Function
/*data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {

    val people = listOf(
        Person("Jack", 34),
        Person("Shelly", 19),
        Person("Patrick", 13),
        Person("Jill", 12),
        Person("Shane", 22),
        Person("Joe", 18)
    )

    val selectedPerson = people.maxBy({ person ->  person.age })

    println(selectedPerson)
    println("name: ${selectedPerson?.name}" )
    println("age: ${selectedPerson?.age}" )
}*/
//HigherOderFun with startswith and
/*

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {

    val people = listOf(
        Person("Jack", 34),
        Person("Shelly", 19),
        Person("Patrick", 13),
        Person("Jill", 12),
        Person("Shane", 22),
        Person("Joe", 18)
    )

    val selectedPerson = people
        .filter { it.name.startsWith("S") }
        .maxBy{ it.age }


    println(selectedPerson)
    println("name: ${selectedPerson?.name}" )
    println("age: ${selectedPerson?.age}" )
}*/
