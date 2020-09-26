FROM openjdk:11
ADD target/report-service-1.0-SNAPSHOT.jar report.jar
EXPOSE 8300
ENTRYPOINT ["java", "-jar", "report.jar"]
CMD dockerize -wait tcp://registry-service:8761 -timeout 60m