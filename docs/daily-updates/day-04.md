# Day 04 — Order Service Initialization

## Goal
Today my goal was to initialize the order-service using Java and Spring Boot and prepare it as an independent microservice in the e-commerce platform.

---

## What I did today
I started by setting up the order-service as a Spring Boot application using Maven. I selected Java 17 and added the required dependencies for building REST APIs and health endpoints.

Then I created the main application class and added a controller with three endpoints:
- `/` to confirm the service is running
- `/health` as a custom health check endpoint
- `/orders` to return a sample list of orders

I also enabled Spring Boot Actuator so the service has a standard health endpoint available at `/actuator/health`, which is useful later for monitoring and Kubernetes health checks.

For now, I used static sample order data so I could focus on service setup and structure first. Later, I will connect this service to a database and make it communicate with the product-service.

After that, I created a multi-stage Dockerfile to package the application into a container image in a cleaner and more realistic way.

Finally, I updated the README for this service and followed the Git feature branch workflow before pushing the code.

---

## Files created
- order-service/pom.xml
- order-service/src/main/java/com/ecommerce/orderservice/OrderServiceApplication.java
- order-service/src/main/java/com/ecommerce/orderservice/controller/OrderController.java
- order-service/src/main/resources/application.properties
- order-service/Dockerfile
- order-service/README.md

---

## Commands used

### Java service setup
```bash
cd ecommerce-platform-app/order-service
