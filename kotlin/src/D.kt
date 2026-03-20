fun main() {
    val (N, M) = readLine()!!.split(" ").map { it -> it.toInt() }
    val S = readLine()!!
    val T = readLine()!!

    if (T.startsWith(S) && T.endsWith(S)) {
        println(0)
    } else if (T.startsWith(S)) {
        println(1)
    } else if (T.endsWith(S)) {
        println(2)
    } else {
        println(3)
    }
}
