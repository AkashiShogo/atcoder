fun main() {
    val (
            N, // 今の年齢
            M, // 求めたい身長の年齢
            X, // 成長が止まり始めた年齢
            T, // Nの時の身長
            D // 毎年伸びる身長    
        ) =
            readLine()!!.split(" ").map { it -> it.toInt() }

    if (M >= X) {
        println(T)
    } else {
        println(T - D * (X - M))
    }
}
