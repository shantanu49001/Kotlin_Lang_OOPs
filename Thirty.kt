import java.lang.Exception

//video 32 se
//exceoption handling in kotlin
//try ke saath catch ya fir finally
fun main(){
    //beche,e exception -->age ki file nhi chalegi
    var arr= arrayOf(1,2,3)
    try {
        //task tkat can return error
        println(arr[5])

    }catch (e:Exception){//handles the after crash--->parent class of all exceptions
      println("Error in code")
        //we can also group tje type of exeption in sertae cathes
        //agar [hele wale se handle ho gya to parent nhi hoga

        //try ke saath ya to vatch ya to finally
        
    }
    finally {//chahe error aaye ya na aaye ye to hoga
        //agar exception hau catch finally
        //agae nhi aya to try and finally
   println("Mai rukega nhi saala!!")

    }
}