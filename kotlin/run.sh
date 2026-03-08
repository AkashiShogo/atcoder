#!/bin/bash
#  ./run.sh で実行
cd ~/work/atcoder/kotlin
kotlinc src/main.kt -include-runtime -d main.jar 2>/dev/null && java -jar main.jar < input.txt
