fun main() {
    val (H, W) = readLine()!!.split(" ").map { it -> it.toInt() }
    var count = 0
    for (h in 0 until H){
        val row = readLine()!!
        for (w in 0 until W) {
            if (row[w].toString() == "#") {
                count++
            }
        }
    }
    println(count)
}
