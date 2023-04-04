//overrding and param  constrcor
//aisi cheeze jo mujhe mere parwn se mili hai lekin mujhe mere according change krna hai

//phone name and sisplay
//but oneplus ki prop to hai name and dislay but i want it to be of different size

//function ans props ko gar overridabe krna hai usme bhi open

open class Mobile(){
   open val name:String=""
    val size:Int=5
    fun makeCall()= print("Calling from parent mobile")
    fun powerOff()= print("sHUTTINng down")
  open  fun dislay()= print("Simple mobile display")

}

class OnePlus:Mobile(){
    override fun dislay() {
     //   super.dislay()-->calls parent one first
        println("Oneplis ka display better hai")
    }

    val s="S seris of oneplu"
    override val name: String
        get() = s
}

fun main(){

    //if i remove super .display it won't call parent function
    //agar hoga to pehle jisko override kiya wo all hoga then edited wala
    //var ke case me dited hi hot hai

    val onePlus=OnePlus()
    onePlus.dislay()  //onepus ka
    println( onePlus.size)  //prent wala
    onePlus.makeCall()

}