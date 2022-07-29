package com.monkeydp.gradle.maven.publish

import com.monkeydp.gradle.maven.publish.MavenRepoType.RELEASE
import com.monkeydp.gradle.maven.publish.MavenRepoType.SNAPSHOT
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import java.net.URI

/**
 * @author iPotato-Work
 * @date 2020/7/1
 */
interface MavenConfig {
    val baseUrl: String
    val repoUrl: String
    val releaseRepoUrl: String
    val snapshotRepoUrl: String
    val releaseRepoUri: URI
    val snapshotRepoUri: URI
    val username: String
    val password: String
    val options: (MavenArtifactRepository.() -> Unit)?
        get() = null

    fun getRepoUri(repoType: MavenRepoType): URI
}

abstract class AbstractMavenConfig : MavenConfig {
    override val repoUrl = "$baseUrl/repository"
    override val releaseRepoUrl = "$repoUrl/maven-releases/"
    override val snapshotRepoUrl = "$repoUrl/maven-snapshots/"
    override val releaseRepoUri = URI(releaseRepoUrl)
    override val snapshotRepoUri = URI(snapshotRepoUrl)

    override fun getRepoUri(repoType: MavenRepoType) =
        when (repoType) {
            RELEASE -> releaseRepoUri
            SNAPSHOT -> snapshotRepoUri
        }
}

enum class MavenRepoType {
    RELEASE, SNAPSHOT
}
