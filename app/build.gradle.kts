plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

application {
    // Вказати основний клас програми
    mainClass.set("SumCalculator")
}

tasks.test {
    useJUnitPlatform()
}