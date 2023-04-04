//function overloading-->same name different params
//eithwer type or count different
//we can store functon inside var

//a.pow(b)  -->study more inbuilt functions

fun main(){
    val fn=::addition
    print(fn(1.0,2.0))
    //to define ti explicityl
    var fnn:(a:Double,b:Double)->Double = ::addition

}
fun addition(a:Double,b:Double):Double{
    return a+b
}
