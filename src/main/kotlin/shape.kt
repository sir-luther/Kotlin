open class Shapes{
    open fun area(){
        println("Area or squared")
    }
}
class Circles:Shapes(){
    override fun area(){
        println("Radius squared multiplied by pi")
    }
}

class Triangles:Shapes(){
    override fun area(){
        println("Half multiplied by base and perpendicular height")
    }
}

class Rectangles:Shapes(){
    override fun area(){
        println("Width multiplied by height")
    }
}

fun main(){
    var cr=Circles()
    cr.area()

    var tr=Triangles()
    tr.area()

    var rt=Rectangles()
    rt.area()
}