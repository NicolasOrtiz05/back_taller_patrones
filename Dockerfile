# Imagen base de Java
FROM openjdk:17-jdk-slim

# Copiar el JAR y ejecutarlo
WORKDIR /app
COPY build/libs/taller-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]
