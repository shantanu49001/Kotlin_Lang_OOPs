
fun main() {
  //  val obj=Outeer().test() //not allowed as inner ka bobject bana nhi =>inner ke emlents form nhi hue to kaise acess?
    val objj=Outeer().Nested().test() //proper way-->no oter option for this



    //2.inner add krne ke badd inner class me hum directly nner ka constr call nhi kr sakte pehle outer ka call kari so that outer ka sab prepare ho sake fr inner to find it
    val nested=Outeer().Nested()
    //  val nested=Outer.Nested()
    nested.test()


}

class Outeer {
    var i=0

  inner  class Nested {
    fun test() {
        println("Hi+$i")    //1.for this class ro find elemnts in outer inner add laro


    }
    }
}
//all doubts are now clear--->commit in git
