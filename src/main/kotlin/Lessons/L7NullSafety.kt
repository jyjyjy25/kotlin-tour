package Lessons

class L7NullSafety {

    fun lengthString(maybeString: String?): Int? = maybeString?.length

    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }

    fun main() {
        println("Lesson7: Null safety")

        //** Nullable types
        println("#Nullable types")

        var neverNull: String = "This can't be null"
        // neverNull = null // throws a compiler error

        var nullable: String? = "You can keep a null here"
        nullable = null

        var inferredNonNull = "The compiler assumes non-nullable"
        // inferredNonNull = null // throws a compiler error

        fun strLength(notNull: String): Int {
           return notNull.length
        }

        println(strLength(neverNull)) // 18
        // println(strLength(nullable)) // throws a compiler error

        //** check for null values
        val nullString: String? = null
        println(describeString(nullString)) // Empty or null string

        //** use safe calls
        println(lengthString(nullString))
        println(nullString?.uppercase()) // skipped calling uppercaser()

        //** use Elvis operator
        println(nullString?.length ?: 0) // 0

    }
}