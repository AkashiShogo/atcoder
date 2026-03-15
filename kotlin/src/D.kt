fun main() {
    val firstLine = readLine()!!.split(" ")
    val totalHeight = firstLine[0].toInt()  // チョコ全体の高さ
    val totalWidth  = firstLine[1].toInt()  // チョコ全体の幅
    val pieceCount  = firstLine[2].toInt()  // ピースの数

    val pieceHeight = IntArray(pieceCount)  // 各ピースの高さ (pieceHeight[i] = i番目のピースの高さ)
    val pieceWidth  = IntArray(pieceCount)  // 各ピースの幅   (pieceWidth[i]  = i番目のピースの幅)
    for (index in 0 until pieceCount) {
        val line = readLine()!!.split(" ")
        pieceHeight[index] = line[0].toInt()
        pieceWidth[index]  = line[1].toInt()
    }

    val xPos = IntArray(pieceCount)  // 各ピースの左上x座標（何行目か）
    val yPos = IntArray(pieceCount)  // 各ピースの左上y座標（何列目か）

    // --- x座標を決める（高さが同じピースは同じx座標） ---
    // key: 高さの値, value: その高さグループのx座標
    val heightToX = mutableMapOf<Int, Int>()
    var currentX = 1  // 次の高さグループに割り当てるx座標（1から始まり積み上がっていく）
    for (index in 0 until pieceCount) {
        val height = pieceHeight[index]
        if (!heightToX.containsKey(height)) {
            // この高さが初登場 → この高さグループのx座標を新たに決めて登録する
            // 2回目以降の同じ高さのピースはこのifに入らず、登録済みのx座標をそのまま使う
            heightToX[height] = currentX
            currentX += height  // 次のグループはheight行分下にずれる
        }
        xPos[index] = heightToX[height]!!  // このピースのx座標 = 高さグループのx座標
    }

    // --- y座標を決める（幅が同じピースは同じy座標） ---
    // key: 幅の値, value: その幅グループのy座標
    val widthToY = mutableMapOf<Int, Int>()
    var currentY = 1  // 次の幅グループに割り当てるy座標（1から始まり積み上がっていく）
    for (index in 0 until pieceCount) {
        val width = pieceWidth[index]
        if (!widthToY.containsKey(width)) {
            // この幅が初登場 → この幅グループのy座標を新たに決めて登録する
            // 2回目以降の同じ幅のピースはこのifに入らず、登録済みのy座標をそのまま使う
            widthToY[width] = currentY
            currentY += width  // 次のグループはwidth列分右にずれる
        }
        yPos[index] = widthToY[width]!!  // このピースのy座標 = 幅グループのy座標
    }

    for (index in 0 until pieceCount) {
        println("${xPos[index]} ${yPos[index]}")
    }
}
