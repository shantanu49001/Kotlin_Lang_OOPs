//functions of collections
fun main(){
    val nums= listOf(1,2,3,4)
    val list=nums.filter ( ::isOdd )  //requires a labdda
    //agar true return hua to lost m dd
    //jus as omparator to vecor in c++
    val list3=nums.filter({a:Int->a%2==0})
    //kotlin map function-->channg data to otherform
    val lisst=nums.map { it*it }   //
     val userlist= listOf(
         User(1,"A"),
     User(2,"B")
     )

    val paidUser=userlist.map {
        //changin one type of data class list to other
        PaidUser(it.id,it.name,"Paid")
        //it cganged the list fo user to paid ud=ser
    }
//user chnaged to paid user but name unchanged
    
    //used whenver we want less or kore foorlds an show the upadted data on same list on the ui

}
fun isOdd(A:Int):Boolean{
    return A%2==0
}

data class User(val id:Int,val name:String)
data class PaidUser(val id:Int,val name:String,val type:String)

