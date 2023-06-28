FROM --platform=linux/arm64/v8 openjdk:19

WORKDIR /app
COPY target/keystone-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "keystone-0.0.1-SNAPSHOT.jar"]
