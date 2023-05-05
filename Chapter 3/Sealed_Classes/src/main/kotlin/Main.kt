sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal){
        is Human -> return "${mammal.name}, you're working as ${mammal.job}"
        is Cat -> return "${mammal.name}"
    }
}

fun main() {
    val cat = Cat("snow ball")
    val human = Human("Augusto", "Student")

    println(greetMammal(cat))
    println(greetMammal(human))
}