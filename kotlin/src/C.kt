fun main() {
    var list = mutableListOf<String>()
    for (i in 0..100) {
        readLine().let { 
            if(!it.isNullOrEmpty()) {
                list.add(it.toString())
            }
         }
    }
    list.reverse()
    for (i in 0 until list.size) {
        println(list[i])
    }
}
