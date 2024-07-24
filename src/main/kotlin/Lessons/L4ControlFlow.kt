package Lessons

class L4ControlFlow {

    fun main() {
        println("Lesson4: Control flow")

        //** Conditional expressions
        println("#Conditional expressions")

        //* if
        val d: Int
        val check = true

        if (check) {
            d = 1
        } else {
            d = 2
        }

        println(d) // 1

        val a = 1
        val b = 2

        println(if (a > b)a else b) // 2

        //* when
        val obj = "Hello"

        when (obj) {
            "1" -> println("One")
            "Hello" -> println("Greeting")
            else -> println("Unknown")
        }

        val result = when (obj) {
            "1" -> "One"
            "Hello" -> "Greeting"
            else -> "Unknown"
        }
        println(result)

        val temp = 18

        val description = when {
            temp < 0 -> "very cold"
            temp < 10 -> "a bit cold"
            temp < 20 -> "warm"
            else -> "hot"
        }
        println(description)

        //** Loops
        println("#Loops")

        //* for
        for (number in 1..5) {
            print(number)
        }
        println()

        val cakes = listOf("carrot", "cheese", "chocolate")

        for (cake in cakes) {
            println("Yummy, it's a $cake cake!")
        }

        //* while
        var cakesEaten = 0
        while (cakesEaten < 3) {
            println("Eat a cake")
            cakesEaten++
        }

        cakesEaten = 0
        var cakesBaked = 0
        while (cakesEaten < 3) {
            println("Eat a cake")
            cakesEaten++
        }

        do {
            println("Bake a cake")
            cakesBaked++
        } while (cakesBaked < cakesEaten)

    }
}