FROM openjdk:17.0.2

WORKDIR /app

COPY ./target/back-nginx.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "back-nginx.jar"]
