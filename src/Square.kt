class Square(_name: String): Shape(_name) {

    var length = 0.0
    var height = 0.0

    fun setDimensions(_length: Double, _height: Double) {
        length = _length
        height = _height
    }

    override fun printDimensions() {
        println("Length and height of the Square $name are: $length and $height respectively.")
        println("Area of the Square $name is: ${getArea()}")
        println("---------------------------------------------")
    }

    override fun getArea(): Double {
        return (length * height)
    }
}