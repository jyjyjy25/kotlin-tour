package Lessons

class L2BasicTypes {

    fun main() {
        println("Lesson2: Basic types")

        //* arithmetic operations
        println("#arithmetic operations")
        var customers = 10

        customers = 8

        customers = customers + 3 // 11
        customers += 7 // 18
        customers -= 3 // 15
        customers *= 2 // 30
        customers /= 3 // 10

        println(customers)

        //* declaration and initialization
        println("#declaration and initialization")

        val d: Int
        d = 3

        val e: String = "hello"

        println(d)
        println(e)

    }
}