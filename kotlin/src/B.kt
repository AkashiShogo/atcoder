fun main() {
    var data = readLine()!!.toInt()
    // var data = readLine()!!.split(" ").map{it->it.toInt()}

    var list = mutableListOf<String>()
    var maxWord = ""
    for (i in 0 until data) {
        val word = readLine()!!.toString()
        if (maxWord.length < word.length) maxWord = word
        list.add(word)
    }

    val maxWordLength = maxWord.length
    for (i in 0 until (list.size)) {
        val diff = (maxWordLength - list[i].length) / 2
        var newWord = list[i]
        for (j in 0 until diff) {
            if (maxWord != newWord)
            newWord = "." + newWord + "."
        }
        println(newWord)
    }
}