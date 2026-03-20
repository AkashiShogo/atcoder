fun main() {
    val N = readLine()!!.toInt()           // 要素数（使わないが読み捨てる）
    val Ai = readLine()!!.split(" ").map { it.toInt() }.toMutableList() // 整数列

    var count = 0                          // 操作回数
    while (Ai.count { it > 0 } >= 2) {    // 正の要素が2個以上ある間くり返す
        Ai.sortDescending()                // 降順ソートして上位2つを先頭に
        Ai[0] -= 1                         // 最大値を1減らす
        Ai[1] -= 1                         // 2番目を1減らす
        count++
    }
    println(count)
}
