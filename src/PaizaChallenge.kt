fun main(args: Array<String>) {
    val (h, w, n) = readln().split(" ").map { it.toInt() }

    val stamps: MutableList<MutableList<String>> = mutableListOf()
    for (i in 1..n) {
        val stamp = mutableListOf<String>()
        for (j in 1..h) {
            stamp.add(readln())
        }
        stamps.add(stamp)
    }

    val (r, c) = readln().split(" ").map { it.toInt() }
    for(i in 1..r) {
        val stampIndexes = readln().split(" ").map { it.toInt() - 1 }
        val lines: Array<String> = Array(h) { "" }

        stampIndexes.forEach { stampIndex ->
            stamps[stampIndex].forEachIndexed { index, str ->
                if (lines[index].isEmpty()) {
                    lines[index] = str
                } else {
                    lines[index] = lines[index] + str
                }
            }
        }

        lines.forEach { println(it) }
    }
}


