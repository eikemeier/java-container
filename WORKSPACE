workspace(name = "com_example_java_container")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

#RULES_DOCKER_VERSION = "0.22.0"
RULES_DOCKER_VERSION = "0.23.0"

RULES_DOCKER_SHAS = {
    "0.22.0": "59536e6ae64359b716ba9c46c39183403b01eabfbd57578e84398b4829ca499a",
    "0.23.0": "85ffff62a4c22a74dbd98d05da6cf40f497344b3dbf1e1ab0a37ab2a1a6ca014",
}

http_archive(
    name = "io_bazel_rules_docker",
    sha256 = RULES_DOCKER_SHAS[RULES_DOCKER_VERSION],
    strip_prefix = "rules_docker-{0}".format(RULES_DOCKER_VERSION),
    url = "https://github.com/bazelbuild/rules_docker/releases/download/v{0}/rules_docker-v{0}.tar.gz".format(RULES_DOCKER_VERSION),
)

# ---

load("@io_bazel_rules_docker//repositories:repositories.bzl", container_repositories = "repositories")

container_repositories()

load("@io_bazel_rules_docker//repositories:deps.bzl", container_deps = "deps")

container_deps()

load("@io_bazel_rules_docker//java:image.bzl", java_repositories = "repositories")

java_repositories()
