fun main() {
    var N = readLine()!!.toInt()
    var An = readLine()!!.split(" ").map {it -> it.toInt()}
    val X = readLine()!!.toInt()

    var res = 
        if (An.contains(X)) {
            "Yes"
        } else {
            "No"
        }
    println(res)
}