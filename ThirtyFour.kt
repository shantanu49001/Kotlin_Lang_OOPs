//lambda expression
//anaymous functions-->no name
//just as obj clases
fun main(){
val lambda1={x:Int,y:Int->x+y}   //body bhi badme
   //lamada ek car hai jisme koi named funcion store nhi hua
    //multiline mabda
val labda2:(Int)->Int={   //since weh have defined tyoes compiler khud se nhi karega

    x->x*x

}

    //sinel param labmda  ->it use
    val simpleLambda:(Int)->Int={
        it*it  //return tupe last line of labmda

    }
    //here we didn;t specify return type
    val multilinelbda={  //here it jusged return type on it's own
        val a=10
        "Done"   //this line is the outpt
        //alst me jo bj return hga wo iska return tye ho jayega

        a    //return
      //  "Done"  -->uncomment thi to see return tupe swap
    }
    println( multilinelbda())
    println(lambda1(2,3))
    println(labda2(3))
}