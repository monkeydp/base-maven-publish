package com.monkeydp.gradle.maven.publish

import com.monkeydp.gradle.maven.publish.MavenRepoType.RELEASE
import com.monkeydp.gradle.maven.publish.MavenRepoType.SNAPSHOT
import org.gradle.api.Project

/**
 * @author iPotato-Work
 * @date 2020/7/1
 */
val Project.mavenRepoType
    get() =
        if (version.toString().endsWith(SNAPSHOT.name))
            SNAPSHOT
        else RELEASE
