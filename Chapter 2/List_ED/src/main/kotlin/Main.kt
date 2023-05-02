val systemUser: MutableList<Int> = mutableListOf(1, 2, 3) //imutable
val sudoers: List<Int> = systemUser //Only read list

fun addSystemUser(newUser: Int){
    systemUser.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach { i ->
        println("$i")
    }
}