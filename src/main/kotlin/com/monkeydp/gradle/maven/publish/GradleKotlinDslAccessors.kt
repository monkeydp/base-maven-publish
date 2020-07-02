package com.monkeydp.gradle.maven.publish

import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension

/**
 * @author iPotato-Work
 * @date 2020/7/1
 */
fun Project.publishing(configure: PublishingExtension.() -> Unit): Unit =
    (this as org.gradle.api.plugins.ExtensionAware).extensions.configure("publishing", configure)