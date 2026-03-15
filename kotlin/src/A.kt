fun main() {
    var data = readLine()!!.toString()
    // var data = readLine()!!.split(" ").map{it->it.toInt()}
    val start =data.take(1)
    val last = data.takeLast(1)
  
    println(if(start == last) "Yes" else "No")
}