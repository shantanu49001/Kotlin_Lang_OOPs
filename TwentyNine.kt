//nullable
//when we don;t jnow which valu var has initially
fun main(){
    var gender2:String?=null  // datatype + ? -->this data type can take value + null
 //   gender2.toUpperCase()  //returns error as we don;t now
    gender2?.toUpperCase()  //null nhi ha to hi function use of Any
    // ?-->safe call operaor   let:lambda
    gender2?.let { //null hoga to inside nhi aayega
        println("$gender2")  //here it s nt gening an error as we ave already checked that it is not null


    }
    var selectedgender=gender2 //auto
    selectedgender=null //while assignng a nullable var to new var comiler alrwady made newvar nullable
    //that is why no error

    //agar value di hai to use use warna default
    var si=gender2?:"N/A"  //?: elvus peraot  if gender 2 non null thenit's vaue is aasigned if null na assigned
    var str=gender2!!.toUpperCase()//-->here we are gbing compiler a garuantee that it won't be null
    

}