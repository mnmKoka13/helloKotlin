fun main(args: Array<String>) {
    val (n, k) = readln().split(" ").map { it.toInt() } // n: ビンゴカードの縦横　k: 抽選回数
    val card: MutableList<MutableList<Int>> = MutableList(n) { mutableListOf() } // ビンゴカード
    for (i in 0 until n) {
        card[i] = readln().split(" ").map { it.toInt() }.toMutableList()
//        println(card[i].joinToString(" "))
    }

    val drawNums = readln().split(" ").map { it.toInt() }

    var bingoCount = 0

    val colScanList: MutableList<Int> = MutableList(n) { 0 }

    for (i in 0 until n) {
        var rowSum = 0
        for (j in 0 until n) {
            // 抽選の数字と一致したら穴をあける = 0にする
            if (drawNums.contains(card[i][j])) {
                card[i][j] = 0
            }
            rowSum += card[i][j]

            // 列の合計に足し込む
            colScanList.set(j, colScanList[j] + card[i][j])
        }

        // 行のビンゴ判定
        if (rowSum == 0) {
            bingoCount++
        }
    }

    // 列のビンゴ判定
    for (col in colScanList) {
        if (col == 0) {
            bingoCount++
        }
    }

    // 斜めのビンゴ判定
    var leftDiagonalSum = 0
    var rightDiagonalSum = 0
    var m = 0
    while (m < n) {
        leftDiagonalSum += card[m][m]
        rightDiagonalSum += card[m][n - m - 1]
        m++
    }
    if (leftDiagonalSum == 0) {
        bingoCount++
    }
    if (rightDiagonalSum== 0) {
        bingoCount++
    }

    println(bingoCount)

}


