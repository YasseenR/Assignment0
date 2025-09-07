class Circle(_name: String): Shape(_name) {

    var radius = 0.0

    fun setDimensions(_radius: Double) {
        radius = _radius
    }

    override fun printDimensions() {
        print("Radius of the Circle $name is: $radius ")
    }
}