//inline00>keyword
fun main(){
calculateTime { loop(1000) }   //it lokks like it just excute funion
    //but hr labda ke liye ek class bnti hai then uske insance se peh;e function call
    //this consumes memory
    //to improve ths we have inline

    //hr non inline labda ki ek class bnti hai au uska objects se labda cess
    
}
fun calculateTime(fn:()->Unit){//var and type
   val start=System.currentTimeMillis()
   fn()
   val end=System.currentTimeMillis()
   println("${start-end}")
}

//isme instance create nhi hoga bas jahan jaha ye function call hoga wahan iski poori body as it call
//avoid extra objects that might have crted to call lambda by deult megid
 fun caalculateTime(fn:()->Unit){//var and type
   val start=System.currentTimeMillis()
   fn()
   val end=System.currentTimeMillis()
   println("${start-end}")
}
inline fun loop(n:Long){
    for (i in 1..n){

    }
}