import java.lang.IllegalArgumentException

//throw-->intentianl error throw by prograaminer to do this as per his logic
//thrws applied on function to tell that this function throws this error

fun main(){
   var count=10
   if (count<11){
            //accsses funtion of throws class

       throw IllegalArgumentException("Count must be geater than 11")
   }
}