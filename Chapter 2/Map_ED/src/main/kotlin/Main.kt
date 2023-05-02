const val Points: Int = 15
val EZPassAccounts: MutableMap <Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatedPointsCredit(accountId: Int){
    if(EZPassAccounts.containsKey(accountId)){
        println("Updating $accountId..")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + Points
    }else{
        println("Error (id: $accountId)")
    }
}

fun accountsReport(){
    println("EZ-Pass report:")
    EZPassReport.forEach{
            k, v -> println("ID $k: credit $v")
    }
}

fun main(){
    accountsReport()
    updatedPointsCredit(1)
    updatedPointsCredit(1)
    updatedPointsCredit(5)
    accountsReport()
}