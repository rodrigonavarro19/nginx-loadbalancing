FROM maven:3.8.3-openjdk-17 as maven-dev-deps

WORKDIR /app
COPY . .
# RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/

# RUN ./mvnw dependency:go-offline

RUN mvn clean package -DskipTests


FROM openjdk:17-jdk-alpine as maven-deploy
WORKDIR /app
COPY --from=maven-dev-deps /app/target/back-nginx.jar .
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "back-nginx.jar"]
