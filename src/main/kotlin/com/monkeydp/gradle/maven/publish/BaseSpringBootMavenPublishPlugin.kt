package com.monkeydp.gradle.maven.publish

import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create

/**
 * @author iPotato-Work
 * @date 2020/7/2
 */
abstract class BaseSpringBootMavenPublishPlugin : BaseMavenPublishPlugin() {
    override fun Project.configPublishing() {
        publishing {
            repositories {
                it.maven(config, mavenRepoType)
            }
            publications {
                it.create<MavenPublication>("mavenJava") {
                    artifact(tasks.getByName("bootJar"))
                }
            }
        }
    }
}