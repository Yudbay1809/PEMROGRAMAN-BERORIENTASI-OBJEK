fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val myString= "Aturus"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}
