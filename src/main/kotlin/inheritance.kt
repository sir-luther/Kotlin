//Parent class
open class Animal{
    var age:Int=50
    var gender:String="Non binary"

    fun isMammal(){
        println("Animal belongs to Kingdom Mammalia")
    }

}

//Child classes

class Duck:Animal(){
    var color:String="Green and grey"
    fun swim(){
        println("Ducks are good swimmers")
    }

}
class Fish:Animal(){
    var canEat:Boolean=true
    fun swim(){
        println("Fish are very good swimmers")
    }

}
class Horse:Animal(){
    var isWild:Boolean=false
    fun run(){
        println("Champion runners of the animal kingdom")
    }

}
fun main(){
    var duck=Duck()
    println(duck.color)

    var fish=Fish()
    println(fish.gender)

    var horse=Horse()
    println(horse.isWild)
}