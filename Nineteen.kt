fun main(){

    val circle=C(4.0)
    println(circle.toString())

    //C inhertits from S  ->S inhetis from Any

    //c's object calls t string since it is in c  c tak hi reach kr payega
    //if i remove from c then it will also go till S

}

open class S{
    open fun area():Double=0.0
    override fun toString(): String {
        return "I am in S -->yhi pr mil gya "
    }
}

class C(val radius:Double):S(){
    override fun toString(): String {
        return "I am in c-->"
    }
}