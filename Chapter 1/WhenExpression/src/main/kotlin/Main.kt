fun main(){
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any { //A function that recive and give back anything
    val result = when (obj){
        1 -> println("One")
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
