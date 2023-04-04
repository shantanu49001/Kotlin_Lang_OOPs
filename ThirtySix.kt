//extension ans inline functions
//whener we want to change a class we needed to extend it in subclass and add new methods to it then in child
/*
*but that if a class if there in a folfe and i want to addnew faturs
* fo doing so i need to add first open ad then mae\je a child class and then add new functons to the newly create childclass
*
* we can simply this by extensions functions
*
* */
open class Aa{
    fun add(){
        println("A")
    }
}
class Bb:Aa(){
    fun bx(){
        println("B")
    }
}


fun main(){
println("Hello".myfunc())  //"Hello" string objhai usse String class ka newly added functio acess
    //this points to "Hello"
    //String ke private memebrs acess nh hoge by myFunc
  val aobj=Aa()
    println(aobj.myfc())
    val bobj=Bb()
    println(bobj.myfc())
}

fun Aa.myfc(){
    println("Extension of a")
}

fun String.myfunc():String{   //String means jis class ko eature function add
    return "-----$this------"

}


