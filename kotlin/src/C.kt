fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    // 各マスの「最終的な停留地点」を格納する配列
    // インデックスを1始まりにするため n+1 のサイズで確保
    val ans = IntArray(n + 1)

    // N→1 の順に処理する理由：
    // 制約 i ≤ A[i] により、マスiのワープ先は必ず i 以上
    // → 大きい番号から処理すれば、マスiを処理するとき A[i] の答えは確定済み
    for (i in n downTo 1) {
        ans[i] = if (a[i - 1] == i) i          // ワープ先が自分自身 → ここが終着点
                 else ans[a[i - 1]]             // ワープ先の答えをそのまま流用（1回で確定）
    }

    // 1..N の答えをスペース区切りで出力
    println((1..n).map { ans[it] }.joinToString(" "))
}
