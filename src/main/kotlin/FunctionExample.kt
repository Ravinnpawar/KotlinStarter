fun double(i: Int): Int {
    return i * 2
}
fun main() {
    val obj = "Name"
    if (obj !is String) {
        println("Obj is String")
    } else {
        println("Obj is not a String")
    }

    val i = double(10)
    println("Value of I: $i")
}

