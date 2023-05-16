class Person{
    //Variables/Properties/Attributes/Data members
    var name:String="Martin"
    var age:Int=19
    var location:String="Nairobi"
    var yoB:Int=2004

    fun eat(){
        println("Eating")

    }
    fun sleep(){
        println("Sleeping")
    }
}
fun main(){
    var teacher = Person()
    println(teacher.location)

    teacher.eat()


    var drive=Car()
    println(drive.color+"  "+drive.model+"  "+drive.make+"  "+drive.max_speed)


}
class Car{
    var model="Porsche"
    var make="LG 280"
    var color="Turquoise"
    var max_speed="150 miles/hr"
    fun drive(){
        println("Driving. Accelerating. Exhilarating!")

    }
    fun turn(){
        println("450 degree four point turn. Donuts. 90 degree turns")
    }
    fun stop(){
        println("Brakes from 60 miles in 2 seconds with brake distance of 10 m. Inertia")
    }
}