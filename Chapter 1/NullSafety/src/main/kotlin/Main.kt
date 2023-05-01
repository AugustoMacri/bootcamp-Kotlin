fun main(){

    var neverNull: String = "Can't be null"
    //neverNull = null
    //Null can not be a value of a non-null type String

    var nullable: String? = "Can keep a null here"  //Can be null because of the "?"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"  //Non type = non-null variable
    //inferredNonNull = null //Error

    fun strLenght(notNull: String): Int{
        return notNull.length
    }

    strLenght(neverNull)
    //strLenght(nullable)
}

/* Working with null
fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}


fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("Bootcamp"))
}
*/
