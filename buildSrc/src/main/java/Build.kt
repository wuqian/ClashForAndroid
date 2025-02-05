import org.gradle.api.Project

const val buildVersionCode = 204004
const val buildVersionName = "2.4.4"

const val buildMinSdkVersion = 21
const val buildTargetSdkVersion = 30

const val buildNdkVersion = "22.1.7171670"

val Project.buildFlavor: String
    get() {
        return if (project(":core").file("src/main/golang/clash/script/script.go").exists())
            "premium"
        else
            "foss"
    }