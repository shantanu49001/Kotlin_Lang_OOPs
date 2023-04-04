//agar function override kr rha hu to bas function open hina hahoye


//here we are inherting fro  a class whos =e costructor requirws params
//we can also override geter and setter just as ufucntion pe kiy tha

                  //expectes a param in c strctor
open class Moobile(val type:String){
    open val name:String=type
    val size:Int=5
    fun makeCall()= print("Calling from parent mobile")
    fun powerOff()= print("sHUTTINng down")
    open  fun dislay()= print("$name")
}
//yahan pass krna pdega paren t class ka constrcir param
class OonePlus(typeparm:String):Moobile(typeparm){
    override fun dislay() {

        //super add tabhi hga jab mai pele parent ka content run krna chahta hu
        //   super.dislay()-->calls parent one first
        println("Oneplis ka display better hai")
    }

    val s="S seris of oneplu"
    override val name: String
        get() = s
}
fun main(){
    val onePlus=OonePlus("SmartPhone")
    onePlus.dislay()
    println( onePlus.size)
    onePlus.makeCall()

}