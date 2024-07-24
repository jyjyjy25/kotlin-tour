package Lessons

data class User(val name: String, val id: Int)

class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

class L6Classes {

    fun main() {
        println("Lesson6: Classes")

        //** Create instance
        println("#Create instance")

        val contact = Contact(1, "mary@gmail.com")

        //** Access properties
        println("#Access properties")

        println(contact.email)
        contact.email = "jane@gmail.com" // update
        println(contact.email)

        //** Member functions
        println("#Member functions")

        contact.printId() // 1

        //** Data classes
        println("#Data classes")

        //* print as string
        val user = User("Alex", 1)
        println(user) // automatically uses toString() function

        //* compare instances
        val secondUser = User("Alex", 1)
        val thirdUser = User("Max", 2)

        println("user == secondUser: ${user == secondUser}") // true
        println("user == thirdUser: ${user == thirdUser}") // false

        //* copy instance
        println(user.copy())
        println(user.copy("Max"))
        println(user.copy(id = 3))

    }
}