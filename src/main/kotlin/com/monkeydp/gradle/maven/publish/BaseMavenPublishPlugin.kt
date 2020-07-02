package com.monkeydp.gradle.maven.publish

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author iPotato-Work
 * @date 2020/7/2
 */
abstract class BaseMavenPublishPlugin : Plugin<Project> {

    protected abstract val config: MavenConfig

    override fun apply(project: Project) {
        project.run {
            pluginManager.apply("org.gradle.maven-publish")
            afterEvaluate { configPublishing() }
        }
    }

    protected abstract fun Project.configPublishing()
}