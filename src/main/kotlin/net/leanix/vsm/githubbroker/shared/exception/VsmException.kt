package net.leanix.vsm.githubbroker.shared.exception

sealed class VsmException(message: String? = null) : RuntimeException(message) {

    class NoRepositoriesFound : VsmException()
}
