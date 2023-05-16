import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Program to calculate perimeter of a circle
        |Enter diameter:
    """.trimMargin())
    var diameter=read.nextInt()

    val pi=3.142

    var perimeter=pi*diameter

    println("Perimeter of the circle is $perimeter")


}