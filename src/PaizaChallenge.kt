fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() } // n: 座席数　m: グループ数
    var seats = MutableList(n) { 0 }
    for (i in 1..m) {
        val copiedSeats = seats.toList().toMutableList()
        val (a, b) = readln().split(" ").map { it.toInt() } // a: 人数 b: 座席番号
        var sitFlg = true
        var nextSeat = b - 1
        for (j in 0 until a) {
            if (copiedSeats[nextSeat] == 1) {
                sitFlg = false
                break
            }
            copiedSeats[nextSeat] = 1
            nextSeat = if (nextSeat + 1 >= n) 0 else nextSeat + 1
        }
        if (sitFlg) {
            seats = copiedSeats
        }
    }
    val result = seats.sum()
    println(result)
}


