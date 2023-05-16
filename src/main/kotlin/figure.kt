open class Figure{
    var area:String= "Calculate area with formula"
        var perimeter:String="Calculate perimeter with formula"
            var Draw="Drawing of figure"
}

class Circle:Figure(){
    var Radius="Distance from centre to perimeter"

}
open class Rectangle:Figure(){
    var width="Less than length"
    var height="More than width"
}

class square:Rectangle(){

}
fun main(){
    var c=Circle()
    println(c.perimeter)

    var r=Rectangle()
    println(r.area)

    var s=square()
    println(s.Draw)
}