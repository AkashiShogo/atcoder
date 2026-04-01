fun main() {
    val (R, G, B) = readLine()!!.split(" ").map { it.toInt() }
    val C = readLine()!!

    val res =
            when (C) {
                "Red" -> minOf(G, B)
                "Green" -> minOf(R, B)
                "Blue" -> minOf(R, G)
                else -> 0
            }
    println(res)
}
