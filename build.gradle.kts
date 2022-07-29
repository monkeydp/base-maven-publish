plugins {
    kotlin("jvm") version "1.7.10"
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.monkeydp.gradle"
version = "2.0.0"
java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    api(gradleKotlinDsl())
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}