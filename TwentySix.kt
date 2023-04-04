//companion objects /classes why do we need it

//we cana also use objet inside classes

//companion in kolin and jvmSttic in java are same


fun main(){
    MyClass.MyObject.f()
    //now what id i wan to acess by Myclass.f()?-->f() that was in anoynous class kw loks as if it is a memeber of myclass

    MyClass.g() //companion-->friend use his things without permission
   //ek class ka ek hi comanion allowed hai


}

class MyClass{//iske mutple ban jayege
   object MyObject{ //psedo class  -->isne ek hi bas class ke saath move krte rahenge
        fun f(){
            println("Hello I am f from objec")
        }
    }

    //also ut is ingeton obj hta bhi d tobhi
  companion  object anotherbj{//My class is my comapanion aka best freuend he can acess my thigs without my perisson
        fun g(){
            println("Heelo i am anther ovhec tfrom class ")
        }
    }

    //ek object ke muitple companion ho sakte hau?
    //el class ka to ek hi compaion hai

}
