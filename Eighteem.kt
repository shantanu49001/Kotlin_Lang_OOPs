//we can also pass child objects in place of parent ones
//"paas" not type as previous

//but if print Area me child req tha udhar [arent nhi kr dsakte
//logically also justfied tht child me extra props hongi jo ki paent ka object kaise acess karega

//but in oace of parent i can pass child ciz child to parent poprs acess kr hi sakta hai


//now child class ka object cjil =d to parent check krta hai jo bhi req hai
//milne pr wahi se retur
//demostration in next 

fun main(){
    val shape=Shapee()
    printArea(shape) //parent objet pass in place of parnt-->parent ka object call
    val c=Circlee(4.0)
    printArea(c) //child obejct pass in place of parent objet to hild ka props call


}

fun printArea(shape: Shapee){
    println(shape.area())  //parent class ke object ki jagah child ke object pas kr sakte hai
    //tat acess child props when child object pssed
    //parent prps when parent objet are passed

}

open class Shapee{
    open fun area():Double=0.0
}

class Circlee(val radius:Double):Shapee(){
    override fun area():Double=Math.PI*radius*radius
}
class Squaree(val side:Double):Shapee(){
    override fun area(): Double {
        return side*side
    }
}
