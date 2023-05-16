//Arithmetic operators
fun main(){
    var num=25
    var mer=6
    println(num+mer)
    println(num/mer)
    println(num*mer)
    println(num-mer)
    println(num%mer)//Modulus

    //Assignment operators
    var x=5
    println(x)

    var y=3
    y*=7
    println(y)

    var a:Double=78.0
    a/=10
    println(a)

    //Comparison operators
    var number:Int=100
    println( number < 50 )
    println( number!==40)
    println(number===90)
    println(number>=19)

    //Logical operators
    var myNumber=90
    println(myNumber>10 && myNumber==30) //And
    println(myNumber>10 || myNumber==30) //Or
    println(!(myNumber>10 || myNumber==30)) //Not
}
