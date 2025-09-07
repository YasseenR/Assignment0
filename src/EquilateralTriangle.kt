import kotlin.math.sqrt

class EquilateralTriangle(_name: String): Triangle(_name) {
    var sideLength = 0.0

    fun setDimensions(_sideLength: Double) {
        sideLength = _sideLength
    }

    override fun printDimensions() {
        print("Side length of the Equilateral Triangle $name is: $sideLength")
    }

    override fun getArea(): Double {
        return ((sqrt(3.0)/4) * (sideLength * sideLength))
    }
}