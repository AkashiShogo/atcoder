fun main() {
    readLine()!!.split(" ").map { it -> it.toInt() }
    var A = readLine()!!.split(" ").map { it -> it.toInt() }.toMutableList()
    val B = readLine()!!.split(" ").map { it -> it.toInt() }
    for (b in 0 until B.size) {
        A.remove(B[b])
    }
    println(A.joinToString(" "))
}
