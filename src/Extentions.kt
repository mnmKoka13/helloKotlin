// 拡張プロパティ
// 拡張プロパティにはバッキングフィールド（データを保存するフィールド）がないため、初期化できない。
// 代わりにgetterを定義することで有効な拡張プロパティを定義できる。
val String.numVowels
    get() = count { "aeiouy".contains(it) }


// addEnthusiasm関数の場合、レシーバ型としてStringを指定している。
// thisキーワード：拡張関数が呼び出されたレシーバのインスタンスを参照する。（この場合、Stringのインスタンス）
// 拡張関数：fun レシーバ型.関数名(引数) { 処理 }
fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

// Anyの拡張関数は全ての型について直接呼び出すことができる。
//fun Any.easyPrint() = println(this)

// easyPrint関数を連鎖をサポートするよう拡張関数に変更する。
// ジェネリック型を使って、どの型でも使えるようにする。
fun <T> T.easyPrint(): T {
    println(this)
    // 自身のレシーバを返すことで連鎖をサポートする
    return this
}

// null許容型のエクステンション
infix fun String?.printWithDefault(default: String) = println(this ?: default)

fun main(args: Array<String>) {
    "Madrigal has left the building".easyPrint().addEnthusiasm().easyPrint()
    42.easyPrint()
    "How many vowels?".numVowels.easyPrint()

    null printWithDefault "Default string" // infix関数の呼び出し
    null.printWithDefault("Default string") // 通常の関数呼び出し
}