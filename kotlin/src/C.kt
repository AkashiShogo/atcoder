fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }

    var now = list[0]
    var next = list[1]
    var index = 0

    while (now < next) {
        now = list[index +1]
        next = list.getOrElse(index + 2, {-1})
        index++
    }
    println(now)
}
