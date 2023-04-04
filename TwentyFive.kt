//object expressions -->root of anaiymous class
//wthout naming the object use
//this can also inherit others


fun main(){

    //idhar ke idhar hi e class ban gyi
    //but snce iska koi name nhi bai aur singl bhi hai so ye ba idhar hi hai 
    var testObj= object:Clone { //only one instance -->idhar ek empty class ban chuki hai
        var x: Int = 10
       fun method(){
           println("")   //this is a dummey class
       }

        override fun clone() {
            TODO("Not yet implemented")
        }
    }
}

interface Clone{
    fun clone()
   // un duplocate()-->if i add this then obj has to implemnt this coz there is one one that can complete a obj delartion by extending/implemting it .
}
