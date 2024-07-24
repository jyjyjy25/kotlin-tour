package Lessons

class L3Collections {

    fun main() {
        println("Lesson3: Collections")

        //* Lists
        println("#Lists")

        // Read only list
        val readOnlyShapes = listOf("triangle", "square", "circle")
        println(readOnlyShapes)

        println("The first item in the list is: ${readOnlyShapes[0]}") // triangle
        println("The first item in the list is: ${readOnlyShapes.first()}") // triangle
        println("The last item in the list is: ${readOnlyShapes.last()}") // circle
        println("This list has ${readOnlyShapes.count()} items") // 3
        println("circle" in readOnlyShapes) // true

        // Mutable list with explicit type declaration
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        println(shapes)

        shapes.add("pentagon") // add
        println(shapes)

        shapes.remove("pentagon") // remove
        println(shapes)

        val shapesLocked: List<String> = shapes // mutable -> read-only

        //* Set
        println("#Set")

        // Read only set
        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        println(readOnlyFruit)

        println("This set has ${readOnlyFruit.count()} items") // 3
        println("banana" in readOnlyFruit) // true

        // Mutable set with explicit type declaration
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
        println(fruit)

        fruit.add("dragonfruit") // add
        println(fruit)

        fruit.remove("dragonfruit") // remove
        println(fruit)

        //* Map
        println("#Map")

        // Read only map
        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu)

        println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}") // 100
        println("The map has ${readOnlyJuiceMenu.count()} key-value pairs") // 3
        println(readOnlyJuiceMenu.containsKey("kiwi")) // true
        println(readOnlyJuiceMenu.keys)
        println(readOnlyJuiceMenu.values)
        println("orange" in readOnlyJuiceMenu) // true
        println(200 in readOnlyJuiceMenu.values) // falss

        // Mutable map with explicit type declaration
        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 190)
        println(juiceMenu)

        juiceMenu.put("coconut", 100) // add
        println(juiceMenu)

        juiceMenu.remove("orange") // remove
        println(juiceMenu)


        val juiceMenuLocked: Map<String, Int> = juiceMenu // mutable -> read-only

    }
}