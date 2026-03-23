fun main() {
    val (X, Y) = readLine()!!.split(" ").map { it.toInt() }
    var res = X
    for (i in 0 until Y) {
        res = res * 2
    }
    println(res)
}
