FROM ubuntu:latest

RUN apt-get update && apt-get install maven openjdk-21-jdk -y

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src /app/src
RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/springboot-thymeleaf-didyouknow.jar"]
