//enum and sealed
//prdefined set of values for varaible -->enum used
//days ke liye one of 1->7 hiho

fun main(){
val day=Day.TUESDAY
    println(day)   //key
    println(day.ordinal)  //posiiton
val day2=Day.MONDAY
    day.printFromattedDay()

    val tile=Tile.Red("Danger",-10)
    val tile2=Tile.Blue("Sucess")
   // val points=when(tile){    //el time pe ek hi use higa but vale change ho payegi
  //   is Tile.Red->tile.points*2
      //   is Tile.Blue-> println(tile2.type)

    }

            //not sent fromoutsode but added so that non deafilt key value van be appiked to all oj
enum class Day(val number:Int){  //it cannot  have costructor but sonce all are objects usme bi constrc add
    MONDAY(number = 0),  //all these are ojects to Day   0
    TUESDAY(number = 2),  //keys --.values cc to pos     1
    WEDNESDAY(number = 3);  //; if we want to add methods
//ek itme pe as many use but value change nhi

    fun printFromattedDay(){  //this meas the one of the oject tha is aclling ths function
        println("$this")
    }
//0 ka object monday
                // 1 ka teaay

}
//enum me state change nhi ho sakata ek baaf kr dya to-->enum me state (value fized)
//so we use sealed class -->werestruct the type and change the value


//selaed isthe final class that won;t be nhertited -->compet hono chahiye
sealed class Tile{//value change nhi hog tpye change ho skti hi
    class Red(val type:String,val points:Int):Tile()
    class Blue(val type:String):Tile()   //object types are different



}