fun main() {
    val (N, T, P) = readLine()!!.split(" ").map { it.toInt() }
    val member = (readLine()!!.split(" ").map { it.toInt() })
    var day = -1
    var count = 0
    while (count < P) {
        count = 0
        day++
        for (n in 0 until N) {
            if ((member[n] + day) >= T) {
                count++
            }
        }
    }
    println(day)
}
