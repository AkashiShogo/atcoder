fun main() {
    var cardSet = ArrayDeque<Int>(100)
    for (i in 0 until 100) {
        cardSet.add(0)
    }
    val Q = readLine()!!.toInt()

    for (i in 0 until Q) {
        val query = readLine()!!.split(' ').map { it -> it.toInt() }
        if (query[0] == 1) {
            cardSet.addFirst(query[1])
        } else {
            println(cardSet.removeFirst())
        }
    }

}
