import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Calculator
        |Enter first number:
    """.trimMargin())
    var num1=read.nextDouble()

    println("Enter second number:")
    var num2=read.nextDouble()

    println("Choose an operation(+,-,*,/):")
    val operator= readln()
    var result=when(operator){
        "+"->  num1+ num2
        "-"->  num1-num2
        "*"-> num1*num2
        "/"-> num1/num2
        else->println("Invalid operator")
    }
    println("$num1 $operator $num2 =$result")

}