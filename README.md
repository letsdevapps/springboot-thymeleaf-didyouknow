# Springboot Did-You-Know

    mvn clean package

    java -jar target/pro-0.0.1-SNAPSHOT.jar 

## Docker

	docker build -t springboot-thymeleaf-didyouknow .

	docker run -it --rm -p 8080:8080 springboot-thymeleaf-didyouknow

	docker run -it --rm -p 8080:8080 springboot-thymeleaf-didyouknow:latest bash

## View

	http://localhost:8080/

	http://localhost:8080/didyouknow

	http://localhost:8080/awards

## Api

    http://localhost:8080/api/didyouknow

    http://localhost:8080/api/didyouknow/all

    http://localhost:8080/api/didyouknow/random

    http://localhost:8080/api/awards

    http://localhost:8080/api/awards/all

