import kotlin.math.abs

//10 3
//24
//35
//3

fun main(args: Array<String>) {
    val firstLine = readln().split(" ")
    val n = firstLine[0].toInt()
    val m = firstLine[1].toInt()

    for (i in 1..m) {
        val weight = readln().toInt()
        if (weight < n) {
            println(n)
            continue
        }
        val quotient: Int = weight / n

        if (abs((quotient * n) - weight) < abs(((quotient + 1) * n) - weight)) {
            println(quotient * n)
        } else {
            println((quotient + 1) * n)
        }

    }
}


// 71,142,213,284,355,426,497,568,639,710,781,852,923,994,1065,1136,1207,1278,1349,1420

//71 8
//804 -> 781
//969 -> 994
//803 -> 781
//814 -> 852
//7 -> 71
//140 -> 142
//107 -> 142
//106 -> 142