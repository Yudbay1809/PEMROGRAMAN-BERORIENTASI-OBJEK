class Human {
    fun callMe() = println("I'm called.")
}

fun main(args: Array<String>) {
    val p1 = Human()

    // calling callMe() method using object p1
    p1.callMe()
}
