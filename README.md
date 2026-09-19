# Springboot Thymeleaf Did-You-Know

![GitHub release](https://img.shields.io/github/v/release/letsdevapps/springboot-thymeleaf-didyouknow)
![GitHub last commit](https://img.shields.io/github/last-commit/letsdevapps/springboot-thymeleaf-didyouknow)

![Java](https://img.shields.io/badge/java-21+-brightgreen)
![Springboot](https://img.shields.io/badge/springboot-3+-brightgreen)

![Docker](https://img.shields.io/badge/docker-enabled-blue)
![Status](https://img.shields.io/badge/status-active-success)

## Maven

    mvn clean package

    java -jar target/springboot-thymeleaf-didyouknow.jar 

## Docker

	docker build -t springboot-thymeleaf-didyouknow .

	docker run -it --rm -p 8080:8080 springboot-thymeleaf-didyouknow

	docker run -it --rm -p 8080:8080 springboot-thymeleaf-didyouknow:latest bash

## View

	http://localhost:8080/

	GET /didyouknow

	GET /awards

## Api

    GET /api/didyouknow

    GET /api/didyouknow/all

    GET /api/didyouknow/random

    GET /api/awards

    GET /api/awards/all

