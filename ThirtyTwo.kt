//colections
//differnce between array and list
//dynamic collection
//list


//mutable list of -->isko change kr aakte hai
fun main(){
    var nums= arrayOf(1,2,3)  //fixed size ka rehta hai

    var numss= mutableListOf<Int>(1,2,3)
    println(numss.indexOf(2))
    println(numss.contains(4))
    numss[1]=2; //only bcoz of mutable

    numss.remove(1)

    val list2= listOf<Int>(1,2)
    numss.addAll(list2)   //db me yhahi use


    //key value pair for map
    val student= mutableMapOf<Int,String>()
    student.put(1,"Me")
    println(student[1])
    println(student.get(1))
    println(student.get(11))   //this will return null nt error
    
}
