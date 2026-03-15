fun main() {

    val N = readLine()!!.toInt()
    val Ai = readLine()!!.split(" ").map { it.toInt() }
    val max = Ai.max()
    val freq = mutableMapOf<Int, Int>()
    for (a in Ai) {
      freq[a] = (freq[a] ?: 0) + 1
    }
    var candidates = mutableListOf<Int>()
    candidates.add(max)

    for (i in 0 until N) {
        candidates.add(max + Ai[i])
    }

    var resList = mutableListOf<Int>()
    for (L in candidates.distinct()){
        var check = true
        for (i in freq.keys) {
            if (L == i) {

            } else if (i < L){
                if (L - i == i) {
                    check = check && (freq[i] ?: 0)%2 == 0
                } else {
                    check = check && (freq[L-i] != null)
                }
            } else {
                check = false
            }
            if (!check) break
        }
        if (check) resList.add(L)
    }
    println(resList.distinct().map{it}.joinToString(" "))
}
