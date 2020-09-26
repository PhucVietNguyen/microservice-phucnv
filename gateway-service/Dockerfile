FROM openjdk:11
ADD target/gateway-service-1.0-SNAPSHOT.jar gateway.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "gateway.jar"]
CMD dockerize -wait tcp://registry-service:8761 -timeout 60m