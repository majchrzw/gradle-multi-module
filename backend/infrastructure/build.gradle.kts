plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.quarkus)
}

dependencies {
    implementation(enforcedPlatform(libs.quarkus.bom))

    implementation(libs.quarkus.core)
    implementation(libs.quarkus.arc)
    implementation(libs.quarkus.rest.jackson)

    implementation(projects.proxy.api)
}

kotlin {
    jvmToolchain(25)
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
