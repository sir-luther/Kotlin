fun main(){
    // Predefined Functions
    println("Kotlin")

    var sq=Math.sqrt(5.0)
    print(sq)

    var round=Math.ceil(3.45)
    println(round)

    var round1=Math.round(3.45)
    println(round1)

    myfun()
    add()
    myDetails("Martin",21)
    plus(10,30)
    minus(50,45)
    multiply(100,56)
    divide(40,8)
}
fun myfun(){
    println("Today is Friday")
}
fun add(){
    var num1=12
    var num2=56
    println(num1+num2)
}
fun myDetails(name:String, age:Int){

    println("$name is $age years old")
}
fun plus(ab:Int,bc:Int){
    println(ab+bc)
}
fun minus(a:Int,b:Int ){
    println(a-b)
}
fun multiply(w:Int,z:Int){
    println(w*z)
}
fun divide(b:Int,c:Int){
    println(b/c)
}