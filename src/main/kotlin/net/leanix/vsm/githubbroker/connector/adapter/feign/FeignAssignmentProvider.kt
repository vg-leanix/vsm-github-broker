package net.leanix.vsm.githubbroker.connector.adapter.feign

import net.leanix.vsm.githubbroker.connector.domain.Assignment
import net.leanix.vsm.githubbroker.connector.domain.AssignmentProvider
import org.springframework.stereotype.Component

@Component
class FeignAssignmentProvider(private val assignmentClient: AssignmentClient) : AssignmentProvider {

    override fun getAssignment(integrationName: String, configurationName: String): Result<Assignment> {
        return kotlin.runCatching {
            assignmentClient.getAssignment(integrationName, configurationName)
        }.map { it.toDomain() }
    }
}
