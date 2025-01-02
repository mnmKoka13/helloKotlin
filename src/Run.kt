import java.io.File

fun main() {
    "Polarcubis, Supreme Master of NyetHack"
        .run(::nameIsLong)
        .run(::playerCreateMessage)
        .run(::println)

    "Madrigal"
        .run(::nameIsLong)
        .run(::playerCreateMessage)
        .run(::println)

    val fileContents = File("myfile.txt").takeIf{
        it.canRead() && it.canWrite()
    }?.readText()
    println(fileContents)
}


fun nameIsLong(name: String) = name.length >= 20
fun playerCreateMessage(nameTooLong: Boolean): String {
    return if (nameTooLong) {
        "Name is too long. Please choose another name"
    } else {
        "Welcome, adventurer"
    }
}

