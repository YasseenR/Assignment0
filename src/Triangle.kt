import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0

    fun setDimensions(_side1: Double, _side2: Double, _side3: Double) {
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }

    override fun printDimensions() {
        println("Lengths of the Triangle $name are: $side1, $side2, $side3")
        println("Area of the Triangle $name is: ${getArea()}")
        println("---------------------------------------------")
    }

    override fun getArea(): Double {
        var perimeter = side1 + side2 + side3
        return (sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3)))
    }

}