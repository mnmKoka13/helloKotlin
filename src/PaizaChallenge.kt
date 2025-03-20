fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val pitchTypes = mutableListOf<String>()
    for (i in 1 .. n) {
        pitchTypes.add(readLine()!!)
    }

    var strikeCount = 0
    var ballCount = 0

    for (pitchType in pitchTypes) {
        if ("strike".equals(pitchType)) {
            if (strikeCount < 2) {
                strikeCount++
                println("strike!")
            } else {
                println("out!")
                return
            }
        } else if ("ball".equals(pitchType)) {
            if (ballCount < 3) {
                ballCount++
                println("ball!")
            } else {
                println("fourball!")
                return
            }
        }
    }
}