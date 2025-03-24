fun main(args: Array<String>) {
    val input = readln().toInt()
    val binary = Integer.toBinaryString(input)

    val result = binary.count() { it == '1'}
    println(result)
}