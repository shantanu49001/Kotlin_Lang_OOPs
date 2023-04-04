//car mechanic service -->car object mechanic object machines object all work to solve a task

//if   want  a phone-->sabse pehle to uski pripops pta hona chaiye
// methods
//props-->object apne baare me kya jante hinge
//methods-->what object does

//these are prop  g of class-->var specific to class obj
class Car(val name:String,val type:String,var kmRan:Int){
    fun driveCar(){
        println("Car movinf")
    }
    fun applyBrakes(){
        println("Car stopped")
    }

}

fun main(){
    var mustang=Car("","",10)
    println(mustang.name)
    mustang.driveCar()
}