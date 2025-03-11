// addEnthusiasm関数の場合、レシーバ型としてStringを指定している。
// thisキーワード：拡張関数が呼び出されたレシーバのインスタンスを参照する。（この場合、Stringのインスタンス）
// 拡張関数：fun レシーバ型.関数名(引数) { 処理 }
fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun main(args: Array<String>) {
    println("Madrigal has left the building".addEnthusiasm())
}