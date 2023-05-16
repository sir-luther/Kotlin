import java.util.Scanner
fun main(){
    println("Enter number between one and five:")
    var read=Scanner(System.`in`)

    var number=read.nextInt()

    var result=when(number){
        1->"One"
        2->"Two"
        3->"Three"
        4->"Four"
        5->"Five"
        else-> "Invalid number"
    }
    println("The number is $result")
}
