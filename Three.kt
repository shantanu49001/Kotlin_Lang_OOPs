//range and whne
fun main(){
    val number=10
    val result=number in 1..5    //range --> in->operator
     //upeer bound included
val result2=number in 1 until 5   //upper bound not inclded


    //when -->switch case of c++
    //multiple if else ka substitue-->to improve this readability
    val a:Int=10;
    when(a){
        1-> print("")
        2-> println("")    //add ranges hee also
        else-> println("")
    }

}