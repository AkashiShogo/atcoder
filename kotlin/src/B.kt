fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val before = mutableListOf<Int>()
    val after = mutableListOf<Int>()

    for (n in 0 until N) {
        val (b, a) = readLine()!!.split(" ").map { it.toInt() }
        before.add(b)
        after.add(a)
    }
    for (m in 1 .. M) {
        println(after.count{it == m} - before.count{it == m})
    }
}
