plugins {
    id("kotlin-android")
    id("com.android.library")
    id("org.jetbrains.dokka") version "1.6.10"
}

android {
    compileSdk = 30
}

dependencies {
    // // Align versions of all Kotlin components
    // implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    //
    // // Use the Kotlin JDK 8 standard library.
    // implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<org.jetbrains.dokka.gradle.DokkaTask>().configureEach {
    dokkaSourceSets {
        named("main") {
            moduleName.set("kalculator")
            moduleVersion.set("0.0.1-SNAPSHOT")
            includes.from("Module.md")
        }
    }
}
