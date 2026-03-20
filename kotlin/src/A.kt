fun main() {

    var (N, X) = readLine()!!.split(" ").map { it -> it.toInt() }
    val list = readLine()!!.split(" ").map { it -> it.toInt() }.filter { it <= X }
    var sum = 0
    for (i in list) {
        sum += i
    }

    println(sum)
}
