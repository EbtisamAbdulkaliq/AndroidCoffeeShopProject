pluginManagement {
    repositories {
        google()
        mavenCentral()
        jcenter() // JCenter repository
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidAppCoffeeShop"
include(":app")
 