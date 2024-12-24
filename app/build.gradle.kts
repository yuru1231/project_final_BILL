plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.lab11"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.lab11"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    dependencies {
        // Android core libraries
        implementation("androidx.core:core-ktx:1.10.1")
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("com.google.android.material:material:1.9.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

        // Compose dependencies
        implementation(platform("androidx.compose:compose-bom:2024.10.00"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.activity:activity-compose:1.7.2")
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        // Testing libraries
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")

        // Custom GitHub dependencies (replace User, Repo, and Tag with actual values)
        implementation("com.github.User:Repo:Tag")
    }

}
