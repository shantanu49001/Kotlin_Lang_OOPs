import java.util.DuplicateFormatFlagsException
import kotlin.math.pow

//higher order functions

//LAMBDA[kahain bhi define kr sakte hai]
//kotlin is also functional language
//functions can be stored int varaiables
//functions are first class citizns just as varaiables
//functions can be sent as varaiables and can be stored inside varaiable


//Higher order function:
//Afunction that might be returning a function or takig function as input
//use->when we want param nd functionality to send to the function
//serer se data send -> aur function se paas krdiya that just wheter server crrect or not in the parent function an the  parent does the work


fun main(){
    println(sum(1.0,3.3))
    var fn=::sum
              //type[just as varaible]   assign
    var fnn:(a:Double,b:Double)->Double=::sum  //eplicitly dfines with the type
  //  println(fnn.)
    println(fn(2.0,4.0))  //calling
    caculator(5.0,5.0,::sum)
}

fun sum(A:Double,b:Double):Double{
    return  A+b
}
fun power(a:Double,b:Double):Double{
    return  a.pow(b)
}
                                //function
fun caculator(a:Double,b:Double,gn:(Double,Double)->Double){//type must be same
    var result=gn(a,b)  //this will call sum
 //and sum retuns the answer



}