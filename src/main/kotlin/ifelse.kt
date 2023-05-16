import  java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("Enter temperature in degrees:")

    var temp=read.nextInt()


    if (temp<37) {
        println("It is too cold")
    }

    else if (temp==37){
        println("Normal temperature")
    }

    else{
        println("It is too hot")
    }
}