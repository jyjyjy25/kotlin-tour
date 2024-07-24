package Lessons

class L1HelloWorld {

    fun main() {
        println("Lesson1: Hello world")

        println("Hello, world!")

        //* Variables
        println("#Variables")
        val popcorn = 5 // read-only variable
        val hotdog = 7 // read-only variable
        var customers = 10 // mutable variable

        customers = 8
        println(customers)

        //* String templates
        println("#String templates")
        println("There ard $customers customers")
        println("There are ${customers + 1} customers")
    }
}