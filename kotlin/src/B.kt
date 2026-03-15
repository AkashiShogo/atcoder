fun main() {
    // var data = readLine()!!.toInt()
    var (N, K) = readLine()!!.split(" ").map{it->it.toInt()}
    var count = 0

    for (i in 0 .. N) {
        val txt = i.toString()
        val leg = txt.length
        var sum = 0

        for (j in 0 until leg) {
            sum = sum + Character.getNumericValue(txt[j])
        }
        if (sum == K) {
            count++
        }
    }
    println(count)
}