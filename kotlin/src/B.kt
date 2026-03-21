fun main() {
    val N = readLine()!!.toInt()
    val cost = Array(N + 1) { IntArray(N + 1) }
    for (i in 1..N - 1) {
        val row = readLine()!!.split(" ").map { it.toInt() }
        for (j in i + 1..N) cost[i][j] = row[j - i - 1]
    }

    var res = "No"
    outer@ for (a in 1..N - 2) {
        for (b in a + 1..N - 1) {
            for (c in b + 1..N) {
                if (cost[a][b] + cost[b][c] < cost[a][c]) {
                    res = "Yes"
                    break@outer
                }
            }
        }
    }
    println(res)
}
