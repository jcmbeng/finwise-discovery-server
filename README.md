# Finwise Discovery Server

The **Finwise Discovery Server** is a Spring Boot-based Eureka Server used for service registration and discovery in the Finwise microservices architecture.

## 🧭 Overview

This service allows other Finwise microservices (such as config-server, notification-service, etc.) to register themselves and discover each other dynamically without hardcoded IPs or URLs.

## 🚀 Features

- Built with **Spring Boot**
- Powered by **Spring Cloud Netflix Eureka**
- Supports dynamic service registration and lookup
- Acts as the central service registry for Finwise microservices

## 🛠️ Tech Stack

- Java 21+
- Spring Boot
- Spring Cloud Netflix Eureka
- Docker & Docker Compose

## 📦 Build the Project

To package the application as a JAR file:

```bash
./mvn clean package

```bash
docker build -t finwise-discovery-server:latest .

```bash
docker compose up -d

```bash
http://localhost:8761/actuator/health
