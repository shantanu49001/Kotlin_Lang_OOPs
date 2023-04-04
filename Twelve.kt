//defualt cosnrcor
fun main(){
val ob=Calculator() //defualt constructir -->when we don't have a constructr kotlin cretes a defualt one with 0 params
    println(ob.add(2,3))
}
class Calculator{ //no constructor in this class

   lateinit var message:String

    fun add(a:Int,b:Int):Int{
        return  a+b;
    }

    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}