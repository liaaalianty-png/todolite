pluginManagement {
    repositories {
        google()            // 🔥 jangan difilter
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()            // 🔥 wajib untuk Firebase
        mavenCentral()
    }
}

rootProject.name = "TodoLite"
include(":app")
