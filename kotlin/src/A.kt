fun main() {
    val N = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for (i in 0 until N) {
        list.add(N - i)
        if (i== N )break
    }
    println(list.joinToString(","))
}
