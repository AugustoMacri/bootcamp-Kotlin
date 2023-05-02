class Animal(val name: String)
class Zoo(val animals: List<Animal>){
    operator fun iterator(): Iterator<Animal>{ //capacity of beeign iterated
        return animals.iterator()
    }
}

fun main(){
    val animals = listOf(Animal("Zebra"), Animal("Lion"))
    val zoo = Zoo(animals)
    for(animal in zoo){
        println("It's a ${animal.name}")
    }
}