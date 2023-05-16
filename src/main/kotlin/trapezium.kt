import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Program to calculate area of a trapezium
        |Enter height:
    """.trimMargin())
    var height= read.nextInt()

    println("Enter base:")
    var base= read.nextInt()

    println("Enter top:")
    var top= read.nextInt()

    var area=height*(base+top)/2
    println("The area is $area")
}