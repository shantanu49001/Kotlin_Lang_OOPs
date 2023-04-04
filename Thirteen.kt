//getter setter
//but there might be some cases whee we may assign the value that is wrong or ight bu wrong
//setter and gteet while assigning those also valiate

//it is also used when we are upadting the props nside the class
//on the same var

fun main() {
    val p1 = Persoon("A", 21)
    println(p1.age)  //getter
    p1.age = 23     //setter     ---->by . operator
}

class Persoon(nameParam: String, agaeParam: Int) {  //cosntricir se koi bhi property nhi bani
    //doori class se agar iski value cahnge ho rhi to to wo bhi

    var name: String = nameParam
        get() {  //edit krke vale return
            return field.toUpperCase()     //upfario bh idhar hi kr sakte hai
        }

    var age: Int = agaeParam  //actual object property idhar se bani
        set(value) {
            if (value > 0) {   //logic to assign the popr value
                field = value
            } else {
                println("Age can't be negative")
            }
        }


}