data class User(val name: String, val age: Int, val gender: String)

fun main(args: Array<String>) {
    val u1 = User("Yudha", 19, "Male")

    val (name, age, gender) = u1
    println("name = $name")
    println("age = $age")
    println("gender = $gender")

    println(u1.component1())
    println(u1.component2())
    println(u1.component3())
}
