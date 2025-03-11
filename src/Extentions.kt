// addEnthusiasm関数の場合、レシーバ型としてStringを指定している。
// thisキーワード：拡張関数が呼び出されたレシーバのインスタンスを参照する。（この場合、Stringのインスタンス）
// 拡張関数：fun レシーバ型.関数名(引数) { 処理 }
fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

// Anyの拡張関数は全ての型について直接呼び出すことができる。
fun Any.easyPrint() = println(this)

fun main(args: Array<String>) {
    "Madrigal has left the building".addEnthusiasm().easyPrint()
    42.easyPrint()
}