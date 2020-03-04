# Branches:

master: demonstrates the usage of HK2 [guice-bridge](https://github.com/javaee/hk2/tree/master/guice-bridge)

without_library: demonstrates the integration of guice without any library

# Running:

`mvn clean package jetty:run`

for testing: `curl http://localhost:8080/resource`

# Bazel build:
bazel build --java_toolchain=@io_bazel_rules_appengine//appengine:jdk8 //my-project
bazel build //main/java/com/feedwheel:myapp