pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/amper/amper")
    }
}

plugins {
    id("org.jetbrains.amper.settings.plugin").version("0.1.4")
    //id("org.jetbrains.kotlinx.benchmark").version("0.4.4")
    //id("org.jetbrains.kotlin.plugin.allopen")
}

//allOpen {
//    annotation("org.openjdk.jmh.annotations.State")
//}