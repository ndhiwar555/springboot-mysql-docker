FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY target/app.jar /app
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]