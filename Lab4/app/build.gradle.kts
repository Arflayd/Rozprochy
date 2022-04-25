/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4.2/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation("junit:junit:4.13.2")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    //akka dependencies
    implementation("com.typesafe.akka:akka-actor-typed_2.13:2.6.19")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    testImplementation("com.typesafe.akka:akka-actor-testkit-typed_2.13:2.6.19")
    testImplementation("junit:junit:4.13.1")

    // akka typed streams
    implementation("com.typesafe.akka:akka-bom_2.13:2.6.19")

    implementation("com.typesafe.akka:akka-stream_2.13:2.6.19")
    testImplementation("com.typesafe.akka:akka-stream-testkit_2.13:2.6.19")
}

application {
    // Define the main class for the application.
    mainClass.set("edu.agh.reactive.App")
}

// build.gradle.kts (Kotlin syntax)
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}