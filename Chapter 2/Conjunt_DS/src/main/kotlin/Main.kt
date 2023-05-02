val openIssues: MutableSet<String> = mutableSetOf("unique1", "unique2", "unique3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String{
    return if (isAdded) "registered correctly" else "marked as duplicate"
}

fun main() {
    val aNewIssue: String = "unique4"
    val aIssueAlreadyIn: String = "unique2"

    println("Issue $aNewIssue $(getStatusLog(addIssue(aNewIssue))}")
    println("Issue $aIssueAlreadyIn $(getStatusLog(addIssue(anIssueAlreadyIn))}")
}