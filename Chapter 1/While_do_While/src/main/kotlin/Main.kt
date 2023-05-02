fun eatACake() = println("Eat")
fun bakeACake() = println("Bake")

fun main(){
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5){
        eatACake()
        cakesEaten ++
    }

    do{
        bakeACake()
        cakesBaked ++
    }while (cakesBaked < cakesEaten)
}