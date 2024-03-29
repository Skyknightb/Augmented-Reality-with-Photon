apply plugin: 'com.android.application'

apply plugin: 'kotlin-android'

apply plugin: 'kotlin-android-extensions'

android {
    compileSdkVersion 28
    defaultConfig {
        applicationId "ptrprograms.com.arboardgame"
        minSdkVersion 26
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation"org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'

    implementation "com.google.ar.sceneform:core:1.7.0"

    implementation 'com.google.firebase:firebase-core:16.0.7'
    implementation 'com.google.firebase:firebase-database:16.1.0'

    implementation 'com.android.support:design:28.0.0'
}

apply plugin: 'com.google.ar.sceneform.plugin'
apply plugin: 'com.google.gms.google-services'

sceneform.asset('sampledata/models/Sol/Sol.gltf',
        'default',
        'sampledata/models/Sol/Sol.sfa',
        'src/main/assets/Sol')

sceneform.asset('sampledata/models/Mercury/Mercury.gltf',
        'default',
        'sampledata/models/Mercury/Mercury.sfa',
        'src/main/assets/Mercury')

sceneform.asset('sampledata/models/Venus/Venus.gltf',
        'default',
        'sampledata/models/Venus/Venus.sfa',
        'src/main/assets/Venus')

sceneform.asset('sampledata/models/Earth/Earth.gltf',
        'default',
        'sampledata/models/Earth/Earth.sfa',
        'src/main/assets/Earth')

sceneform.asset('sampledata/models/Luna/Luna.gltf',
        'default',
        'sampledata/models/Luna/Luna.sfa',
        'src/main/assets/Luna')

sceneform.asset('sampledata/models/Mars/Mars.gltf',
        'default',
        'sampledata/models/Mars/Mars.sfa',
        'src/main/assets/Mars')

sceneform.asset('sampledata/models/Jupiter/Jupiter.gltf',
        'default',
        'sampledata/models/Jupiter/Jupiter.sfa',
        'src/main/assets/Jupiter')

sceneform.asset('sampledata/models/Saturn/Saturn.gltf',
        'default',
        'sampledata/models/Saturn/Saturn.sfa',
        'src/main/assets/Saturn')

sceneform.asset('sampledata/models/Neptune/Neptune.gltf',
        'default',
        'sampledata/models/Neptune/Neptune.sfa',
        'src/main/assets/Neptune')

sceneform.asset('sampledata/models/Uranus/Uranus.gltf',
        'default',
        'sampledata/models/Uranus/Uranus.sfa',
        'src/main/assets/Uranus')