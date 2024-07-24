package Lessons

class L5Functions {

    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }

    val upperCaseString2: (String) -> String = { text -> text.uppercase() }

    fun uppercaseString(text: String): String {
        return text.uppercase()
    }

    fun sum2(x: Int, y: Int) = x + y

    fun printMessage(message: String) {
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun hello() {
        return println("Hello, world!")
    }

    fun main() {
        //** Functions
        println("#Functions")

        hello()
        println(sum(1, 2))

        //** Named arguments & Default parameter values
        println("#Named arguments & Default parameter values")

        printMessageWithPrefix("Hello", "Log")
        printMessageWithPrefix("Hello")
        printMessageWithPrefix(prefix = "Log", message = "Hello")

        //** Functions without return
        println("#Functions without return")

        printMessage("Hello")

        //** Single-expression functions
        println("#Single-expression functions")

        println(sum2(1,2))

        //** Lambda expressions
        println("#Lambda expressions")

        println(uppercaseString("hello"))
        println({text: String -> text.uppercase()}("hello"))

        //* Assign to variable
        val upperCaseString = { text: String -> text.uppercase() }
        println(upperCaseString("hello"))

        //* Pass to another function
        val numbers = listOf(1, -2, 3, -4, 5, -6)
        val positives = numbers.filter { x -> x > 0 }
        val negatives = numbers.filter { x -> x < 0 }
        println(positives)
        println(negatives)

        val doubled = numbers.map { x -> x * 2 }
        val tripled = numbers.map { x -> x * 3 }
        println(doubled)
        println(tripled)

        //* function types
        upperCaseString2("hello")

        //* Return from a function
        val timesInMinutes = listOf(2, 10, 15, 1)
        val min2sec = toSeconds("minute")
        val totaalTimeInSeconds = timesInMinutes.map(min2sec).sum()
        println("Total time is $totaalTimeInSeconds secs")

        //* Invoke separately
        println({ text: String -> text.uppercase() }("hello"))

        //* Trailing lambdas
        println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6
        println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) // 6

    }
}