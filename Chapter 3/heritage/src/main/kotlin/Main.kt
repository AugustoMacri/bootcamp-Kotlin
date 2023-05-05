open class Dog {
    open fun bark(){
        println("bark")
    }
}

class Husky : Dog(){
    override fun bark(){
        println("bark2")
    }
}

fun main() {
    val dog: Dog = Husky()
    dog.bark()
}