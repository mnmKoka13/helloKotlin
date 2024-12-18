fun main(arg: Array<String>) {
//    val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
//        val currentYear = 2024
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
//    }

    // 型推論を使う
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2024
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName(copyright $currentYear)"
//    }

//    val greetingFunction: (String) -> String = {
//        val currentYear = 2024
//        "Welcome to SimVillage, $it!(copyright $currentYear)"
//    }
//    runSimulation("Guyal", greetingFunction)

    // 略記構文
    runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2024
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName!(copyright $currentYear)"
    }
}

// 関数を受け取る関数
fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}