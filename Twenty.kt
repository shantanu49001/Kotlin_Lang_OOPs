//abstract class concepts
//when we dont know how to hande  a object at gievm time instant
//eg: if i am geve a shape(2) and area asked
//i don't knwo how to calculate since i don;t knwo the shape

//abstract used when we want that my chidren should define me i don;t want

//child classes body de parent ki

//when we don;t know body of functo or class make it abstarct
//astarct element s exixt inside the abstarc classes
//co obviously if mere paas kisi function ki boduy nhi hai to obvious hai uska parent entty bhi incomplete hi hai
//shape abstract class hai to val shape=Shape()-->error
//object ko pt hi nhi hoga ki abstarct class ka abstract element handle kaise hoga

//now jo abstarct hote ha wo open hi hote hhai
//koi bhi class jo abstarct ko use karegi use abstarct elements k o define krna padega[saari] just as overridbg aur agar hum sab nhi kr rhe to child ko abhi abstract karo coz uska bhi object incompte e,ents ko call kr sakta hai aur error aa jayega-->child ka bhi object nhi ban payega
//abstact wale funions ko we don't override we implemnt[super hot hi nhi hai ]-->super bh kya kr lega jab parent me hi wo incmplet tha

fun main(){
    val circle=Ciircle(4.0)
    println(circle.area())
    circle.display()
    
}

abstract class Shhape{  //it can't naje objects
    var name:String=""
    abstract fun area():Double
    abstract fun display()

}

class Ciircle(val radius:Double ):Shhape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun display() {
        println("..")
    }

}
