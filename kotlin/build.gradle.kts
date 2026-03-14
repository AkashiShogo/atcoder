plugins {
    kotlin("jvm") version "2.1.0"
    application
}

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
}

sourceSets {
    main {
        kotlin.srcDirs("src")
    }
}

application {
    mainClass.set("AKt")
}

// 問題ごとの実行タスク (nr a, nr b, ...)
listOf("a", "b", "c", "d", "e", "f").forEach { prob ->
    tasks.register<JavaExec>(prob) {
        group = "atcoder"
        description = "Run problem ${prob.uppercase()}"
        dependsOn("classes")
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("${prob.uppercase()}Kt")
        standardInput = file("src/input.txt").inputStream()
    }
}
