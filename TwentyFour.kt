
//normally we make clasees and then acess them via objetcs
//but we can directly form calsses together with acesign object

//same tyep ke mutlipe oject nj ban dakte -->use class for etiher
//object decl used when we want object only of  type
//no costrcutr
//init can be used
//object can inherit from class and intrface
//singeton pattern -->only one objecy o A posbl which is A itself


fun main(){
println(A.num)
SharingWIdget.incrementFbLies()
SharingWIdget.incrementTwitterLikes() //is me changes hine hr baar
SharingWIdget.display()
B.t
}

object A{ //object decalration   A s saare acess
    val num:Int=19  //inside me class hai -->psuedo
}

open class Ss(){
   var t=10
}
object B:Ss(){
    val g:Int=20
    fun test(){
        println("I am Object B")
    }
}




//use case of singletom
//implemt a widget group having facbook whatsapp jahan pr notodifcation same grpoup me ho aaye
object SharingWIdget{
    private var twitterLikes=0
    private var fblikes=0

    fun incrementTwitterLikes()= twitterLikes++
    fun incrementFbLies()= fblikes++
    fun display()= println("Facebook likes: $fblikes TwittterLikes: $twitterLikes")
}