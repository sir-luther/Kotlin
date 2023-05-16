open class Shape{
    open fun draw(){
        println("Drawing magic")
    }
}
class Triangle:Shape(){
    override fun draw(){
        println("Sketching an artpiece")
    }
}

class Square:Shape(){
    override fun draw(){
        println("Sculpting a vase")
    }
}

fun main(){
    var t=Triangle()
    t.draw()

}