fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val K = readLine()!!.toInt()
    println(list.count{it >= K})
}
