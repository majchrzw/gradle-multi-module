plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(enforcedPlatform(libs.quarkus.bom))

    implementation(libs.quarkus.core)
    implementation(libs.quarkus.arc)
    implementation(libs.quarkus.rest.jackson)
}
