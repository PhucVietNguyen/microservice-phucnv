FROM openjdk:11
ADD target/oauth-service-1.0-SNAPSHOT.jar oauth.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar", "oauth.jar"]
CMD dockerize -wait tcp://registry-service:8761 -timeout 60m