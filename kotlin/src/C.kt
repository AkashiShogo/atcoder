fun main() {
    val (N, D) = readLine()!!.split(" ").map { it.toInt() }
    val schedule = List(N) { readLine()!! } // N人のスケジュール

    var max = 0   // 最長の連続全員休み日数
    var count = 0 // 現在の連続全員休み日数

    for (i in 0 until D) {
        if ((0 until N).all { j -> schedule[j][i] == 'o' }) {
            count++
            max = maxOf(max, count)
        } else {
            max = maxOf(max, count)
            count = 0
        }
    }
    println(max)
}
