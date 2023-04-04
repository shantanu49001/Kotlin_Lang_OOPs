//kotlin genrics
//just as temlte in c++
fun main(){
val c=Container<Int>(3)
   println(c.setValue(3))

    //list map all are generic classes by defaut
    
}

val a=Container<String>("a")

class Container<T>(var data:T){
    fun setValue(value:T):T{
        return value
    }
}
class IntContianer(var data:Int){
    fun setResult(){
        data=2*data
    }
}