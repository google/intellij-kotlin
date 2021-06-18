// GENERATED build.gradle.kts
// GENERATED BY kotlin.gradle.gradle-native.iml
// USE `./gradlew generateIdeaGradleFiles` TO REGENERATE THIS FILE

plugins {
    kotlin("jvm")
    `java-library` // Add `compileOnlyApi` configuration
    id("jps-compatible")
}

repositories {
    maven { setUrl("https://cache-redirector.jetbrains.com/maven-central") }
    maven { setUrl("https://cache-redirector.jetbrains.com/intellij-third-party-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jcenter") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.google.com/dl/android/maven2") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.jenkins-ci.org/releases") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.bintray.com/groovy/maven/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/jediterm/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/markdown") }
    maven { setUrl("https://cache-redirector.jetbrains.com/www.myget.org/F/rd-snapshots/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/download.jetbrains.com/teamcity-repository") }
    maven { setUrl("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-plugin/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/space") }
    maven { setUrl("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-ide-plugin-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide") }
    maven { setUrl("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-ide-plugin-dependencies") }
}

dependencies {
    implementation(toolsJarApi())
    jpsLikeJarDependency(kotlinStdlib(), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-stdlib-jdk7"), JpsDepScope.COMPILE)
    jpsLikeJarDependency("junit:junit:4.12", JpsDepScope.TEST)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-for-ide"), JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.native", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-idea", JpsDepScope.COMPILE)
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-api") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources_en") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("javac2") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("forms_rt") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.COMPILE) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.COMPILE) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("extensions") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-ide-util-io") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("util") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-util-ex") }) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.COMPILE) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.COMPILE) // 'intellij.platform.lang' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle-java", forIde = true), JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle", forIde = true), JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:gradle-api:6.7", JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.slf4j:slf4j-log4j12:1.7.25", JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-impl") }) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("external-system-rt") }) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.jetbrains.teamcity:serviceMessages:2019.1.4", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy-ant:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("log4j:log4j:1.2.17", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("idea_rt") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-core-ui") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-impl") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources_en") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-api") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("extensions") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("javac2") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("forms_rt") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-ide-util-io") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-concurrency") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("jps-model") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework.core") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("util") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-util-ex") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-util-ui") }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.jetbrains:jetCheck:0.2.2", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.0", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.5.11", JpsDepScope.TEST) // 'intellij.platform.testFramework' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.platform.externalSystem.tests", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.platform.lang.tests", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.gradle.toolingExtension.tests", JpsDepScope.TEST) // 'intellij.gradle.toolingExtension.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.gradle.tests", JpsDepScope.TEST) // 'intellij.gradle.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.kotlin.resources-fe10", JpsDepScope.TEST)
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        java.srcDir("src")
        resources.srcDir("resources")
    }
    "test" {
        java.srcDir("test")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-version", "-Xstrict-java-nullability-assertions", "-Xjvm-default=enable", "-Xskip-prerelease-check")
    kotlinOptions.jdkHome = rootProject.extra["JDK_11"] as String
    kotlinOptions.useOldBackend = true // KT-45697
}

testsJar()