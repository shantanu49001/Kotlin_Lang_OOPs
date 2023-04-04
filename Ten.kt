//constructors
//when we want to give defualt values to constructors


//VVIMP.
//note if we add val var to constrictor of a class then only ir deg=fines it as prperty of the object
//else it will just use it as a param to store something


//now

fun main(){
var car=Automoble("Car", 4, 5, "Petrol")//iski to value hum provide kr paa re hai
    var person=Person()
    println(person.name)  //but iski nhi kr paa rhe hai
    println(person.age)
    var person2=Person()
    println(person2.name)   //same output for person 2 and person
    println(person2.age)

    var personedited=valuepasskrnekeliyenewperson("p",10)
//how do we ssign values?-->constructir me param add krke

}


                 //rpimary costcuor
class Automoble(val name: String, val tyres: Int, val maxSeat: Int, s: String){
     val hasAirbags=maxSeat  //now this also becomes prop of the object of this class

      fun drive(){}
    fun applyBrakes(){}
}

class Empty{}

//no primary propertyy defined isme asie define hogi props
class Person(){
    val name:String="Cra"
    var age:Int=10

}

//coz constrcror is also afunction usme paam add krdo
//this is different from autom constrictpr

class valuepasskrnekeliyenewperson(name: String,age:Int){
    val  name:String=name  //here we have abenefit tht jo value pass ho rhi hai we can edit and save it
    val age:Int=age  //in this class we can store edited property

}




