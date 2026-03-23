fun main() {
    var (X, Y) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    while (X < Y) {
        X += 10
        count++
    }
    println(count)
}
