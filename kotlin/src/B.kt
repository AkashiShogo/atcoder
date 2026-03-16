fun main() {
    // var data = readLine()!!.toInt()
    var (N, T, A) = readLine()!!.split(" ").map{it->it.toInt()}

    val half = N/2

     if (T > half || A > half) {
      println("Yes")
  } else {
      println("No")
  }
}