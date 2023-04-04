import javax.xml.crypto.Data

//calses that hold oly group of adat
//no methods
//gropp of data from krke type seperate krta hau

//gteer setter apne app implement ho jata hai

fun main(){
    val p1=NonDataPeersonn(1,"John")
    val p2=NonDataPeersonn(1,"John")

    //for non data classes-->to sting ka bhi ouput poper nhi hai
    println(p1) //object pr println-->to string run ho jta ha-->any class
    println(p2)
    println(p1.hashCode())//any class
    println(p2.hashCode())//both hve differnt values despite same data

    //but we want that if data s same they must have same addresses
    //for uniquness

    val p3=DataPeersonn(1,"John")
    val p4=DataPeersonn(1,"John")
    println(p3)
    println(p4)
    println(p3.hashCode())
    println(p4.hashCode())
    //data class me utility functions hote hai
    val p5=p4.copy(id=2)
    println(p5) //copis values of p4 with different id
    println(p5.hashCode()) //hashcode will be definlty different than p4
    
}

 class NonDataPeersonn(val id :Int,val name:String ){

}

/*
* they have tutility functions
*
* */
data class DataPeersonn(val id :Int,val name:String ){

}

