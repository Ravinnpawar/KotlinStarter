
/*fun String.removeFirstLastChar(): String {
    return substring(1,this.length-1)
}*/
//=  this.substring(1, this.length - 1)
fun main(args: Array<String>) {
    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}

private fun String.removeFirstLastChar(): String {
    return this.substring(1,this.length-1)

}
/*
private fun String.removeFirstLastChar(): String {
    return this.substring(1,this.length-1)
}*/
