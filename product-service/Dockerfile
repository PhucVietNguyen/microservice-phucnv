FROM openjdk:11
ADD target/product-service-1.0-SNAPSHOT.jar product.jar
EXPOSE 8200
ENTRYPOINT ["java", "-jar", "product.jar"]
CMD dockerize -wait tcp://registry-service:8761 -timeout 60m