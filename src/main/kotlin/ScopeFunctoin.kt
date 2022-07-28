class Company() {
    lateinit var name: String
    lateinit var objective: String
    lateinit var founder: String
}

fun main() {
    // without using scope function

    // creating instance of Company Class
    /*val company = Company()

    // initializing members of the class
    company.name = "ABC"
    company.objective = "A computer science portal for Students"
    company.founder = "XYZ"

    println(company.name)*/

    // using scope function
    /*val company = Company().apply {
        // don't need to use object
        // name to refer members
        name = "ABC"
        objective = "A computer science portal for Students"
        founder = "XYZ"
    }
    println(company.name)*/


    //let Function

        // nullable variable a
        // with value as null
       /* var a: Int? = null
        // using let function
        a?.let {
            // statement(s) will
            // not execute as a is null
            print(it)
        }
        // re-initializing value of a to 2
        a = 2
        a?.let {
            // statement(s) will execute
            // as a is not null
            print(it)
        }*/



    //With Function

   /* val company = Company().apply {
        name = "ABC"
        objective = "A computer science portal for Students"
        founder = "XYZ"
    }

    // with function
    with(company) {
        // similar to println( "${this.name}" )
        println(" $name ")
    }*/
    /*class Company() {
        lateinit var name: String
        lateinit var objective: String
        lateinit var founder: String
    }

    fun main() {
        val company = Company().apply {
            name = "ABC"
            objective = "A computer science portal for Students"
            founder = "XYZ"
        }

        // with function
        with(company) {
            // similar to println( "${this.name}" )
            println(" $name ")
        }
    }*/



    //Also function


    // initialized
    val list = mutableListOf<Int>(1, 2, 3)
    // later if we want to perform
    // multiple operations on this list
    list.also {
        it.add(4)
        it.remove(2)
        // more operations if needed
    }
    println(list)
    /*fun main() {
        // initialized
        val list = mutableListOf<Int>(1, 2, 3)

        // later if we want to perform
        // multiple operations on this list
        list.also {
            it.add(4)
            it.remove(2)
            // more operations if needed
        }
        println(list)
    }
*/
    //Apply function

    class Company() {
        lateinit var name: String
        lateinit var objective: String
        lateinit var founder: String
    }

    fun main() {
        Company().apply {
            // same as founder = “Sandeep Jain”
            this.founder = "ABC"
            name = "Mins"
            objective = "A computer science portal for Students"
        }
    }




}
