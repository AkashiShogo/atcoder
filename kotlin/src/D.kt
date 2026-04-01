fun main() {
    val N = readLine()!!.toInt()
    var As = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val Q = readLine()!!.toInt()
    var nextQ = readLine()?.split(" ")?.map { it.toInt() }
    var sb = StringBuilder()

    while (nextQ != null) {
        if (nextQ[0] == 1) {
            As[nextQ[1] - 1] = nextQ[2]
        } else {
            sb.appendLine(As[nextQ[1] - 1])
        }
        nextQ = readLine()?.split(" ")?.map { it.toInt() }
    }
    println(sb)
}
