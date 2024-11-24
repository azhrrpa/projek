plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services") // Pastikan plugin ini ada
}

android {
    namespace = "com.example.farmasiapp"
    compileSdk = 35 // Gunakan compileSdk, bukan var compileSdk

    defaultConfig {
        applicationId = "com.example.farmasiapp"
        minSdk = 26 // Sesuaikan minSdk jika perlu
        targetSdk = 35 // Sesuaikan targetSdk jika perlu
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0") // Gunakan versi spesifik
    implementation("androidx.appcompat:appcompat:1.6.1") // Gunakan versi spesifik
    implementation("com.google.android.material:material:1.9.0") // Gunakan versi spesifik
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Gunakan versi spesifik
    implementation(platform("com.google.firebase:firebase-bom:32.2.3"))
    implementation("com.google.firebase:firebase-firestore-ktx") // Gunakan -ktx untuk Kotlin
    implementation("com.google.firebase:firebase-messaging-ktx") // Gunakan -ktx untuk Kotlin

    // Dependensi pengujian
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}