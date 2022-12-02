plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.recentclaims"

    defaultConfig {
        minSdk = 26
       // targetSdk = 33
        compileSdk = 33
        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility =JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation (project(":data"))
    implementation ("androidx.core:core-ktx:1.8.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation(libs.androidx.activity.compose)
    // implementation 'androidx.compose.ui:ui-graphics'
    // implementation 'androidx.compose.ui:ui-tooling-preview'
    api(platform(libs.compose.bom))
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    // implementation(libs.compose.foundation.foundation)
    implementation(libs.compose.foundation.layout)
    // implementation(libs.compose.material.material)
    implementation(libs.compose.material.iconsext)
    implementation(libs.compose.animation.animation)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.viewbinding)
    implementation(libs.compose.ui.material3)
    implementation(libs.compose.ui.ui)

    testImplementation ("junit:junit:4.13.2")
    // Compose test
    androidTestImplementation (platform(libs.compose.bom))
    // Test rules and transitive dependencies:
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling")
    // Needed for createAndroidComposeRule, but not createComposeRule:
    debugImplementation ("androidx.compose.ui:ui-test-manifest")


    androidTestImplementation ("androidx.test.ext:junit:1.1.4")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.0")
}