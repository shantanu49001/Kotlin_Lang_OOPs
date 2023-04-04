//scped functons

fun main(){
    val emp=Emp()
    emp.age=20
    emp.name="Shntanu"

    //jis obj pr ye call hoga this use point arga
    emp.apply {//ye tab use hoga jab obj ki diff values to set
        //apply to set value
        emp.age=10
        emp.name=" "
        //agar ism boht prps hoti ti useful

        //jis obj pr lagega use hi return
    }

    //nw let's say mujhe is obj ki props print krni hoti
    //ek ek krke hr ek to print krna padta
    emp.let {   //ye tab use hoga jab obj ki differt value pr operation krna ho
        println(it.age)
        println(it.age)
//reyrn value==>last k return
        2  //retur \n val
    }
    //agar ise var ko asign karegnge to 2 retn

    //let usecase -->obj ke har elemnt ko nullablecheck

    emp?.age=1
    emp?.name=""  //hr porp ko agar non null check then value

    emp?.let {
        //iske adar obj ki hrprop nin null

it.name=""
    }
//we can also use with but then we have this refenced by default it likhne ki bhi zaroort nhii iska bh return type last wala
    with(emp){
        name=""
    }


    //with and let ka combo--.study more
    emp.run {

    }

}

data class Emp(var name:String="",var age:Int=18)