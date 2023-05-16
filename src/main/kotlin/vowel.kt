import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("""Letter reader
        |Enter the letter:
    """.trimMargin())

    var letter=readln()

    if (letter=="a" ||  letter=="e" || letter=="i" || letter=="o" || letter=="u"){
        println("$letter is a vowel")

    }
    else{
        println("$letter is a consonant")
    }
}