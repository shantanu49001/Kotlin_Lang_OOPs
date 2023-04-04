//Any class

//every kotlin class has any as super class
//euqals hashCode to string all are open functions in amy class

//humri class ka object obj.name.toString()-->this r=two sting is the open function in amy class

//acess modifiers-->dekh lena


//polymorphism-->a parent can hol reference t child classes and call methods of child classes
//type paent karnhe pr bhi obeeride krne pr bhi child ka hi call kiya bas [super removed the]

//refernces parent ke object child ka chid ka hi memebers call hoga by this types of obejct


fun main() {
    //as we know cicle is also shape
    val circle: Circle = Circle(4.0)
    val circle2: Shape = Circle(4.0)  //same as circle  typ parent ka but object child classes ka
    val square: Square = Square(4)
    println(circle.area())
    println(circle2.a)
    println(square.area())
    println(circle2.area())//same as circle

    //parent class type array-->for clear demostrtaion
    val shapes = arrayOf<Shape>(
        Circle(4.0),
        Square(2)
    )

    for (i in shapes) {
        println(i.area())
    }
}

open class Shape {
    val a=10;
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        //   return super.area()-->if we used this then we might have faced ussue that is retuned 0.0
        return Math.PI * radius * radius      //
    }
}

class Square(val sides: Int) : Shape() {
    override fun area(): Double {  //obeeride kya to param return type change nhi hona chahye
        return sides * sides.toDouble()
    }
}