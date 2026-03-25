fun main() {
    var (H, W, X, Y) = readLine()!!.split(" ").map { it.toInt() }
    var C = 0
    val map = mutableMapOf<Int, String>()
    for (i in 1..H) {
        map.put(i, readLine()!!)
    }
    val walking = readLine()!!
    var done = mutableListOf<Pair<Int, Int>>()
    for (w in 0 until walking.length) {
        val word = walking[w].toString()
        val before = Pair(X, Y)
        when {
            word == "U" -> X -= 1
            word == "D" -> X += 1
            word == "L" -> Y -= 1
            word == "R" -> Y += 1
        }
        val next = map.get(X)!!.toString().get(Y - 1).toString()
        if (next == "#") {
            X = before.first
            Y = before.second
        }
        if (next == "@" && !done.contains(Pair(X, Y))) {
            C++
            done.add(Pair(X, Y))
        }
    }
    println("$X $Y $C")
}
