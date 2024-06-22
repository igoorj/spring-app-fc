FROM maven:3.9.0-amazoncorretto-17 AS build

COPY /src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean package -DskipTests

FROM openjdk:17-alpine

COPY --from=build /app/target/*.jar /app/app.jar

WORKDIR /app

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]