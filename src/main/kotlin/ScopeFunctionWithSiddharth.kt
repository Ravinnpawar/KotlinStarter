class ScopeFunctionWithSiddharth {
    var name :String?="Shri"
    var age:Int?=50

}

fun main() {
    /*val scopeFunctionWithSiddharth=ScopeFunctionWithSiddharth()
    scopeFunctionWithSiddharth.age=33
    scopeFunctionWithSiddharth.name="Ravindra"
*/
   /* val scopeFunctionWithSiddharth=ScopeFunctionWithSiddharth().apply {
        name="Ravindra"
        age=33
        println(name)
        println(age)
    }*/
    val scopeFunctionWithSiddharth= ScopeFunctionWithSiddharth()

    var a:Int=with(scopeFunctionWithSiddharth) {
        name="Ravindra"
        age=33
        println(this.name)
        println(this.age)
        age!!


    }

    val scope=scopeFunctionWithSiddharth.also {
        it.name="Hi Hello"
        it.age=34
    }

    val lambdaE ={

        print("Hello Lambda")
    }
    println(lambdaE)



}