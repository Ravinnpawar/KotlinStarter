class ClassExample() {
    fun callMethod(){
        println("Called from ClassExample Class")
    }
}
fun main(){
    val classExample=ClassExample()
    classExample.callMethod()
}