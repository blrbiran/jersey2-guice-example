#load("@io_bazel_rules_appengine//appengine:java_appengine.bzl", "java_war")
#
#java_war(
#    name = "myapp",
#    srcs = glob(
#        ["guiceconfig/Config.java",
#         "guiceconfig/GuiceModule.java",],
#    ),
#    data = ["//main/webapp:web-inf"],
#    data_path = "/webapp",
#    deps = [
#        "//lib:aopalliance",
#        "//lib:guava",
#        "//lib:guice",
#        "//lib:guice_bridge",
#        "//lib:hk2_api",
#        "//lib:hk2_locator",
#        "//lib:hk2_utils",
#        "//lib:jakarta_activation",
#        "//lib:jakarta_activation_api",
#        "//lib:jakarta_annotation_api",
#        "//lib:jakarta_inject",
#        "//lib:jakarta_validation_api",
#        "//lib:jakarta_ws_rs_api",
#        "//lib:jakarta_xml_bind_api",
#        "//lib:javax_inject",
#        "//lib:javax_servlet_api",
#        "//lib:jersey_client",
#        "//lib:jersey_common",
#        "//lib:jersey_container_servlet",
#        "//lib:jersey_container_servlet_core",
#        "//lib:jersey_hk2",
#        "//lib:jersey_server",
#        "//main/java/com/feedwheel/resource",
#        "//main/java/com/feedwheel/service",
#    ],
#)

load("@io_bazel_rules_appengine//appengine:java_appengine.bzl", "appengine_war")

appengine_war(
    name = "myapp",
    jars = ["//main/java/com/feedwheel/guiceconfig:guice_config"],
    data = ["//main/webapp:web-inf"],
    data_path = "/webapp",
)