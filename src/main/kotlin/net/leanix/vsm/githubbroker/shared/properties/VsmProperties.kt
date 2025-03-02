package net.leanix.vsm.githubbroker.shared.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "leanix.vsm.connector")
data class VsmProperties(
    val apiToken: String,
    val configName: String,
    val githubToken: String,
    val githubUrl: String
)
