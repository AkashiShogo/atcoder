fun main() {
    val round = readLine()!!.toInt()
    var start = Pair(0, 0)
    var time = 0
    var goal = true
    
    for (i in 0 until round) {
        val next = readLine()!!.split(" ").map{it -> it.toInt()}
        val diff_distance = Math.abs(next[1] - start.first) + Math.abs(next[2] - start.second)
        val diff_time = next[0] - time
        if (!(diff_distance <= diff_time)) {
            print("No")
            goal = false
            break
        }

        if (!((diff_time - diff_distance) % 2 == 0)) {
            println("No")
            goal = false
            break
        }
        start = Pair(next[1], next[2])
        time = next[0]
    }
    if (goal) {println("Yes")}
}