FROM openjdk:11
ADD target/registry-service-1.0-SNAPSHOT.jar registry.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "registry.jar"]