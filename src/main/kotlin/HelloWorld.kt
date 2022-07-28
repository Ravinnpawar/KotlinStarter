//Any is base class in kotlin.
//We are having two types of variables in kotlin
// -Var- Mutable
//Val- Immuatable
//const val-
//lateinit and lazy

const val id=120
fun main(){
    lateinit var name :String
    //val age by lazy()
    val age=21
    name="Aayush"
    //age=21+1
    println("Name: "+ name)
    println("Age: "+age)
}