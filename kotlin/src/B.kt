fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    var list = ArrayDeque<String>(readLine()!!.split(" "))
    for (k in 0 until K) {
        list.removeFirst()
        list.addLast("0")
    }
    println(list.joinToString(" "))
}
