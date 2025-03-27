fun main(args: Array<String>) {
    val (h, w) = readln().split(" ").map { it.toInt() }
    val picture = Array(h) { CharArray(w) }

    for (i in 0 until h) {
        picture[i] = readln().toCharArray()
    }

    var result = 0
    // １行目と最終行の'.'はドーナッツにならない。
    // 2行目からh-1行目までを走査する。
    for (i in 1 until h - 1) {
        // 同じく、１列目と最終列の'.'はドーナッツにならない。
        // 2列目からw-1列目までを走査する。
        for(j in 1 until w - 1) {
            if (picture[i][j] == '.') {
                // '.'の周囲８マスが全て'#'であればドーナッツと判定する。
                if (picture[i - 1][j - 1] == '#' &&
                    picture[i - 1][j] == '#' &&
                    picture[i - 1][j + 1] == '#' &&
                    picture[i][j - 1] == '#' &&
                    picture[i][j + 1] == '#' &&
                    picture[i + 1][j - 1] == '#' &&
                    picture[i + 1][j] == '#' &&
                    picture[i + 1][j + 1] == '#')
                {
                    result++
                }
            }
        }
    }
    println(result)
}


