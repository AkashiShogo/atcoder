fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val A1 = A + A
    val A2 = A1 + 1

    if (A1 == B || A2 == B) {
        println("Yes")
    } else {
        println("No")
    }
}
