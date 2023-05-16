import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Program to calculate volume of a cuboid
        |Enter length:
    """.trimMargin())
    var length= read.nextInt()

    println("Enter width:")
    var width= read.nextInt()

    println("Enter height:")
    var height=read.nextInt()

    var volume=width*length*height
    println("The area is $volume")
}