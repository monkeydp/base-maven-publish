package com.monkeydp.gradle.maven.publish

import org.gradle.api.artifacts.dsl.RepositoryHandler

/**
 * @author iPotato-Work
 * @date 2020/7/1
 */
fun RepositoryHandler.maven(config: MavenConfig, repoType: MavenRepoType) =
    maven { repo ->
        repo.url = config.getRepoUri(repoType)
        repo.credentials {
            it.username = config.username
            it.password = config.password
        }
    }