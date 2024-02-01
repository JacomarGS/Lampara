plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "Lampara"
include("src:utilities")
findProject(":src:utilities")?.name = "utilities"
include("src:models")
findProject(":src:models")?.name = "models"
