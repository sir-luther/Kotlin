import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Program to calculate area of a rectangle
        |Enter length:
    """.trimMargin())
    var length= read.nextInt()

    println("Enter width:")
    var width= read.nextInt()

    var area=width*length
    println("The area is $area")
}