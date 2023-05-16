class Hund(var breed:String,var size:String,var age:Int,var color:String){
    fun eat(){
        println("Eating")

    }
    fun sleep(){
        println("Sleeping")
    }
    fun sit(){
        println("Running")
    }
}
fun main(){
    var dog1=Hund("Neapolitan Mastiff", "large",5,"black")
    println(dog1.breed+" "+dog1.size+" "+dog1.age+" "+dog1.color)

    var dog2=Hund("Maltese","small",2,"white")
    println(dog2.breed+" "+dog2.size+" "+dog2.age+" "+dog2.color)

    var dog3=Hund("Chow Chow","medium",3,"brown")
    println(dog3.breed+" "+dog3.size+" "+dog3.age+" "+dog3.color)
}
