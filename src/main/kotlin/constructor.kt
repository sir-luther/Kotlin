class Dog(var color:String, var breed:String ,var sex:String, var age:Int){


}
fun main(){
    var d=Dog( "Tawny white,brown and black", "Great Pryness","Non binary",   12)
    println(d.color)

    var puppy=Dog("brown","Harvanese","trans",120)
    println(puppy.breed)

}