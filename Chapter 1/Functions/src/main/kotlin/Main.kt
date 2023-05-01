// Default Parameter Values Named Arguments
fun printMessage(message: String): Unit{    //type of return (Unit)
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){ //If no one especifies the value, assign info to prefix
    println("[$prefix] $message") //interpolation os strings
}

fun sum(x: Int, y: Int) : Int {
    return x+y
}

fun multiply(x: Int, y: Int) = x* y

fun main(){
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Value")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Value", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))

}



