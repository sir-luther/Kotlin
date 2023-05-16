import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Enter the three numbers here
        |Number 1:
    """.trimMargin())
    var num1=read.nextInt()

    println("Number 2:")
    var num2=read.nextInt()

    println("Number 3:")
    var num3=read.nextInt()

    if (num1>num2 && num1>num3) {
        println("$num1 is the greatest")
    }
    else if (num2>num1 && num2>num3){
        println("$num2 is the greatest")

    }
    else if (num3>num1 && num3>num2){
        println("$num3 is the greatest")
    }
}