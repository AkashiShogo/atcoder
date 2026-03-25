fun main() {
    var (S, T, X) = readLine()!!.split(" ").map { it.toInt() }

    if (S < T && S <= X && X < T) {
        println("Yes")
    } else if (S > T && (X >= S || X < T)) {
        println("Yes")
    } else {
        println("No")
    }
}
