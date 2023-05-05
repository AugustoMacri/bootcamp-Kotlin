data class User(val name: String, val id: Int){
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun main(){
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("SecondUser = ${user == secondUser}")
    println("ThirdUser = ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())

    println(user.copy())
    println(user === user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))
}