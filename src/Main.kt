import java.util.Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name: String = ""
    var length: Double = 0.0
    var height: Double = 0.0
    var side3: Double = 0.0

    val reader = Scanner(System.`in`)
    println("Hi and welcome to the shape creator program!")
    println("---------------------------------------------")
    println("To get started, please type the name of the Square you want to create:")

    name = reader.next()

    println("Awesome! Your squares name is $name.")
    println("Please type your desired length:")
    length = reader.nextDouble()

    println("Please type your desired height:")
    height = reader.nextDouble()

    var square = Square(name)
    square.setDimensions(length, height)

    println("Awesome! We have created your square. Now please type the name of the Circle you want to create:")
    name = reader.next()

    println("Awesome! Your circles name is $name.")
    println("Please type your desired radius:")
    length = reader.nextDouble()

    var circle = Circle(name)
    circle.setDimensions(length)
    println("Awesome! We have created your circle. Now please type the name of the Triangle you want to create:")
    name = reader.next()

    println("Awesome! Your triangles name is $name.")
    println("Please type your first desired side length:")
    length = reader.nextDouble()
    println("Please type your second desired side length:")
    height = reader.nextDouble()
    println("Please type your third desired side length:")
    side3 = reader.nextDouble()

    var triangle = Triangle(name)
    triangle.setDimensions(length, height, side3)
    println("Awesome! We have created your triangle. Now please type the name of the Equilateral Triangle you want to create:")
    name = reader.next()

    println("Awesome! Your triangles name is $name.")
    println("Please type your desired side length:")
    length = reader.nextDouble()

    var equilateralTriangle = EquilateralTriangle(name)
    equilateralTriangle.setDimensions(length)

    println("Awesome, we created all shapes. Here are your created shapes:")

    square.printDimensions()
    circle.printDimensions()
    triangle.printDimensions()
    equilateralTriangle.printDimensions()


}