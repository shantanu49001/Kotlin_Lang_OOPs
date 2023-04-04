//now we want that on forming the object of the class it must run some set of instrictions

//seconday constrcir

fun main(){
    var car=Automoblee("Car",4,5,"Petrol")
    var car2=Automoblee("Car2",4,5,"[etrol")
   //norml cars me bakki prps to same hinge but ame different hoga
    //by desfult constrcir me ye sab saath me pass krna padega
    //to solve tis wehave seconday cons
    //now we can also remove the ones that are specic and resuncdan wale saare seconday se hi paas kr sakte hai
    var car3=Automoblee("Mustang","Petrol") //baaki props apne aap jo same hai same hi hog gyi

}


class Automoblee(val name:String,val tyres:Int,val maxSeat:Int,val engineType:String){

    init {  //pehle props define hongi then init block run hoga
        println("Inside init")
    }
    //we can have multiple initilser block
    init {
        println("done")
    }
                                                 //primary call
constructor(nameParam:String,engineParam:String):this(nameParam,4,5,engineParam)
//seconday ne koi prp nhi bahai balki primary ko hi di hai banne ko
    //coz secon me val var nhi add hu hai



    fun drive(){}
    fun applyBrakes(){}

    //init[saare] primary then seconday [agar primary se kahin deligate nhi hue to ]coz secon se deligate ho gye primary pr

}







