fun main(arg: Array<String>) {
    val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
        val currentYear = 2024
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
    }
//    val greetingFunction: (String) -> String = {
//        val currentYear = 2024
//        "Welcome to SimVillage, $it!(copyright $currentYear)"
//    }
    println(greetingFunction("Guyal", 2))
}