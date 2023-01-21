FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/springboot-k8s-cluster-yaml.jar springboot-k8s-cluster-yaml.jar

ENTRYPOINT ["java","-jar","springboot-k8s-cluster-yaml.jar"]