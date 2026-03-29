fun main() {
    val N = readLine()!!.toInt()
    val member = mutableMapOf<Int, Int>()

    for (n in 0 until N) {
        val row = readLine()!!
        member.put(n + 1,row.count { it == 'o' })
    }
    val sorted = member.entries.sortedWith(
      compareByDescending<Map.Entry<Int, Int>> { it.value }.thenBy { it.key }
  )
    println(sorted.joinToString(" ") { it.key.toString() })
}
