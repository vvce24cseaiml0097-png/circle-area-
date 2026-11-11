
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/circle-area-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-cp", "app.jar", "com.example.circle_area.App"]
