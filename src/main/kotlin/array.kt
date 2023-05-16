fun main(){
    var languages= arrayOf("Python","Kotlin","Java")

    println(languages[0])//Accessing an element

    languages[0]="Javascript"
    println(languages[0])//Changing an element
    var language=languages.plus(element = "C")
    for (lang in language){
        println(lang)
    }

    for(c in languages){
        println(c)
    }
    println(languages.size)
}