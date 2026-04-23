# Order Service

## Overview
This service is responsible for handling order-related operations in the e-commerce platform.

## Responsibilities
- Return order list
- Later support order creation and management
- Later communicate with product-service for product validation

## Endpoints
- `GET /` - basic service response
- `GET /health` - custom health check endpoint
- `GET /orders` - return order list
- `GET /actuator/health` - Spring Boot actuator health endpoint

## Run locally
```bash
mvn spring-boot:run
