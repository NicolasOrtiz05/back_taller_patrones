FROM gradle:9.4.0-jdk21 AS builder

WORKDIR /app
COPY . .

RUN gradle clean build -x test

FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]