//inhertitence
//phone and smart phone have some commine fetarues
//to avoid duplicay we use inheritence
//common  feturs parent s =e and extra khud se

//jo class aage inherit hog use specify krna padta hau by adding open
/*
*     Phone
*   name,type,vol
*makeCall(),display(),powerOff(),getDeviceInfo()
*
* kotlin me ek class ka ek hi parent
*
* contructor order if parent has n init and child aslo has n init
*
* parent ka constrctor agar deiga kr rha hoga to karega
* child can't exist withut parent
* whenver chid object fored -->pehle parnt ke init and primary cnstructur secon constrctor the  chid ke
*
*
* */
open class Phone{  //this class in inhertable

    init {//class call hote hi saare init call hote hai
        println("Prent cinstructor called ")
    }

    val name:String=""
    val type:String=""
    val volume:Int=10

    fun makeCall(){}
    fun display(){}
    fun poweroff(){}
    fun getDeviceInfo(){}
}

class BasicPhone:Phone(){//agar idhr common props honge unpr error ayega

    init {
        println("Child clalled ")
    }

    fun getScreenInfo(){}

    //isa onjet banane pr iski to poprs acess ho sakti hai
    //phone ki bhi ho sakti hai based on visibity


}


class SmartPhone:Phone(){
    fun playMovie(){}
    fun takePicture(){}
    fun getLocation(){}
}

fun main(){
  val obj1=BasicPhone()
}