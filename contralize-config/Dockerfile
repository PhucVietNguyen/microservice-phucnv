FROM openjdk:11
ADD target/contralize-config-1.0-SNAPSHOT.jar centralize.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "centralize.jar"]