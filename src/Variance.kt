// outキーワード：producerの役割を与える → その型の値を返すことができる。
//　=> 書き込みはできないのでvarキーワードを持つパラメータは使えない。
class Barrel<in T>(item: T)

fun main(args: Array<String>) {
    var fedoraBarrel: Barrel<Fedora> = Barrel(Fedora("a generic-looking fedora", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))

    fedoraBarrel = lootBarrel
}