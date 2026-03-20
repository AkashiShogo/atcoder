fun main() {
    val N = readLine()!!.toInt()
    val list = mutableListOf<String>()

    for (i in 0 until N) {
        list.add(readLine()!!)
    }
    var res = "No"
    outer@ for (x in 0 until N) {
        for (y in 0 until N) {
            if (x == y) continue
            val str = list[x] + list[y]
            if (str == str.reversed()) {
                res = "Yes"
                break@outer
            }
        }
    }
    println(res)
}
