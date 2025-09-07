class Circle(_name: String): Shape(_name) {

    var radius = 0.0

    fun setDimensions(_radius: Double) {
        radius = _radius
    }

    override fun printDimensions() {
        println("Radius of the Circle $name is: $radius ")
        println("Area of the Circle $name is: ${getArea()}")
        println("---------------------------------------------")
    }

    override fun getArea(): Double {
        return (3.14 * (radius * radius))
    }
}