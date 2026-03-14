package a

fun main() {
    var data = readLine()!!.split(" ").map{it -> it.toInt()}
    // var data = readLine()!!.split(" ").map{it->it.toInt()}
    val L = data[0] // 長さ
    val R = data[1]
    val D = data[2]
    val U = data[3]
    var count = 0

    for (x in L .. R) {
        for (y in D .. U) {
            val res = Math.max(Math.abs(x),Math.abs(y))
            if (res%2 == 0) {
                count ++
            }
        }
    }
    println(count)
}
