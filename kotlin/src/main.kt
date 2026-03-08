fun main() {
    val num = readLine()!!.toInt()
    var row = mutableListOf<Int>()

    // 個数分繰り返す
    for (i in 0 until num) {
        row.add(readLine()!!.toInt())
    }
    println(row.distinct().size)
}