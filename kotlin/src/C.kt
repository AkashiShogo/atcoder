import java.util.TreeMap

fun main() {
    val Q = readLine()!!.toInt()
    var map = TreeMap<Int, Int>()
    var sb = StringBuilder()
    var total = 0
    for (q in 0 until Q) {
        val (query, h) = readLine()!!.split(" ")
        if (query == "1") {
            map[h.toInt()] = (map[h.toInt()] ?: 0) + 1
            total++
        } else {
            val sub = map.headMap(h.toInt() + 1)
            total -= sub.values.sum()
            sub.clear()
        }
        sb.appendLine(total)
    }
    print(sb)
}
