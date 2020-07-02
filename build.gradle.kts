plugins {
    kotlin("jvm") version "1.3.72"
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.monkeydp.gradle"
version = "1.0.0.RELEASE"
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