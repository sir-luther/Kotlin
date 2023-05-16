import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("Enter the number:")
    var num=read.nextInt()
     if (num<0){
         println("$num is negative")



     }
    else if (num==0){
        println("0 is neither")
    }
    else {
        println("Number is positive")
     }
}