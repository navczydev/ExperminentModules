plugins {
//    id 'com.android.library'
//    id 'org.jetbrains.kotlin.android'
   // id 'kotlin-kapt'
  //  id("com.google.dagger.hilt.android")
    id("mm.android.library")
    id("mm.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.example.data"
  //  compileSdk 33

    defaultConfig {
      //  minSdk 26
      //  targetSdk 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

   /* buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }*/
   /* compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }*/
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}


dependencies {

    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    // Retrofit & OkHttp
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")


    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.4")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.0")
}