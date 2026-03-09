@file:Suppress("UnstableApiUsage")

rootProject.name = "backend"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
    }
}

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.jvm") version "2.3.10"
    }
}

include(":infrastructure")
include(":proxy:api")
