load("@io_bazel_rules_docker//java:image.bzl", "java_image")
load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name = "hello_library",
    srcs = glob(["*.java"]),
)

java_binary(
    name = "hello_world",
    main_class = "com.example.hello_world.Main",
    visibility = ["//visibility:public"],
    runtime_deps = [":hello_library"],
)

java_image(
    name = "hello_world_image",
    main_class = "com.example.hello_world.Main",
    visibility = ["//visibility:public"],
    runtime_deps = [":hello_library"],
)
