//inner and nested classes
//next file
fun main() {
//val obj=Outer().test()  //outsode class ka object inseide acess nhi kr sakta
    val nested = Outer.Nested()
    nested.test()
}

class Outer {
    var i = 0

    class Nested {
        //eg:Apater class or the view model clas
        fun test() {  //use case-->some classes that xis on;y inside others they require some specuial arguments /data given by some other lass
            //     println("Hi+$i")  //same with inner class it is not abh=e tof ind lmnts offouter class


        }
    }
}