fun main() {
    var (N, D) = readLine()!!.split(" ").map { it.toInt() }
    val list = mutableMapOf<Int, String>()

    for (i in 0 until N) {
        val row = readLine()!!
        list.put(i, row)
    }
    var max = 0
    var count = 0
    for (i in 0 until D) {
        val day = mutableListOf<String>()
        for (j in 0 until N) {
            val a = list[j]!![i].toString()
            day.add(a)
        }
        if (day.count() { it == "o" } == N) {
            count++
            max = Math.max(max, count)
        } else {
            max = Math.max(max, count)
            count = 0
        }
    }
    println(max)
}
