//interfaces

//since kotlin me ek class ek hi class s inherit kr sakti hai
//bu t it can inherit from n interfaes -->mutiple inherit achived by intefaces
//overrise me param and return type change x


//now let's say shapes ek parent chid herichy me hai
//player doosr parent child herichy se aya

//but bit trees ke objects ek commnin game me drahhable hai then ho w to link all those tree herihy to use common fnction drag?


//intface is a contract between tree of child parent where theuy have to implent it ny how


fun main(){
  //  val drg:Draggbe=Draggbe //does't have constarcors so no objects of this ineface
    val drgg:Draggbe=Cirrcle(4.0,10) //interface ki jaha chiold class obj allowed
}


interface Draggbe{ //it can have implemented non  implemented memeber s
//objects k doubt hau
   //if a function is incomplete in itherface it is by default abstarct

   // val dragSpeed=10-->iniialse nhi kr sakte
    val drgaspeed:Int

    fun drag()

}

interface Clonaable{
    fun clone()
}

fun dragObjects(objects:Array<Shaape>){  //now we can even replace shape by draggele as ab parent sabka draggable hai
    for (obj  in objects){  //Array<Drwaagle> isme agar circle aaya to apne bhi kr lega aur draggel ke bhi kr lega
      //  obj.drag()
    }
}

abstract class Shaape:Draggbe,Clonaable{ //shape ne iterface implent nhi kiya to abs hai
    abstract fun area():Double
  //  abstract fun drag()

    override fun drag() {  //parent ne interface implent kiya but comlete nhi kiya to iterface jis tree me ya udhar usko krna hi padega define
        TODO("Not yet implemented")
    }
}

class Cirrcle(val radius:Double, override val drgaspeed: Int):Shaape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }


    override fun clone() {
        TODO("Not yet implemented")
    }

    /*   override fun drag() {-->when it was in class
        println("Circle is dragginf")
       }
   */
}

class Squuare(val side:Double):Shaape(){ //same logic interface incomplet the paren ne bhi complete nhi kiyato child jo prent ko kr rha hai use krna ho adge
    override fun area(): Double {
        return side*side
    }

    override val drgaspeed: Int
        get() = TODO("Not yet implemented")


    override fun clone() {
        TODO("Not yet implemented")
    }



}

