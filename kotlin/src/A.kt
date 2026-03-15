fun main() {
    var data = readLine()!!.toString()
    // var data = readLine()!!.split(" ").map{it->it.toInt()}
    var char = data[0]
    var res = "No"

    for (i in 1..2) {
        if (char == data[i] && data[0] == data[i]) {
            res = "Yes"
        } else {
            char = data[i]
        }
    }
  
    println(res)
}