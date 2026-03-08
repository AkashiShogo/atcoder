# AtCoder 練習コード

![Last Commit](https://img.shields.io/github/last-commit/AkashiShogo/atcoder)
![Stars](https://img.shields.io/github/stars/AkashiShogo/atcoder?style=social)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?logo=kotlin&logoColor=white)

AtCoder の問題を解いた記録リポジトリです。
言語ごとにディレクトリを分けて管理しており、**複数言語での実装を通じて言語特性・アルゴリズムへの理解を深める**ことを目的としています。

---

## ディレクトリ構成

```
atcoder/
├── kotlin/        # Kotlin での回答
│   ├── src/
│   │   └── main.kt    # 解答コード
│   ├── run.sh         # ビルド & 実行スクリプト
│   └── input.txt      # サンプル入力
└── cpp/           # (準備中) C++ での回答
```

---

## 動作環境

| 項目 | バージョン |
|------|-----------|
| Kotlin | 2.1.0 |
| JVM | Java 17 |
| Gradle | 9.x |

---

## 実行方法

```bash
cd kotlin
./run.sh
```

1. `src/main.kt` に解答コードを記述する
2. `input.txt` にサンプル入力を貼り付ける
3. `./run.sh` でコンパイル & 実行

---

## 学習方針

- 問題の解法を自分の言葉で理解してから実装する
- 複数言語での実装を通じて、言語ごとの特性と表現力の違いを学ぶ
- アルゴリズム・データ構造の引き出しを継続的に増やす

---

## 今後の予定

- [ ] C++ での回答ディレクトリ追加
- [ ] 問題ごとのコードを蓄積・整理していく
