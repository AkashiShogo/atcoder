fun main() {
    // var data = readLine()!!.toInt()
    var (N, C1, C2) = readLine()!!.split(" ")
    var S = readLine()!!
    for (i in 0 until S.length) {
        if (S[i].toString() != C1) {
            S = S.replace(S[i].toString(), C2)
        }
    }
    println(S)
}
