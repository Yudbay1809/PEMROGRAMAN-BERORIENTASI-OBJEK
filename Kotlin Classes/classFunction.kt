class Cars(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }
}

fun main() {
    val c1 = Cars("Ford", "Mustang", 1969)

    // Call the function
    c1.drive()
}