fun main() {
    val num = readLine()!!.toInt()
    val cards = readLine()!!
    .split(" ")
    .map { it.toInt()}
    .sortedDescending()

    var alice = 0
    var bob = 0

    for (i in 0 until num) {
        // alice
        if ((i % 2) == 0) {
            alice = alice + cards[i]
        } else {
            bob = bob + cards[i]
        }
    }
    println(alice - bob) 
}