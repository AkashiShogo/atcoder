fun main() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    var s3 = readLine()!!
    val list = readLine()!!.map{Character.getNumericValue(it)}
    
    var res = ""

    for (i in list) {
        if (i == 1){
            res = res + s1
        } else if (i == 2) {
            res = res + s2
        } else {
            res = res + s3
        }
    }
    println(res)
}
