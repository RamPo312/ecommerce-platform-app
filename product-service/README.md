# Product Service

## Overview
This service is responsible for handling product-related operations in the e-commerce platform.

## Responsibilities
- Return product list
- Provide product details
- Later support create, update, and delete operations

## Endpoints
- `GET /` - basic service response
- `GET /health` - health check endpoint
- `GET /products` - return product list

## Run locally
```bash
python -m venv venv
venv\Scripts\activate
pip install -r requirements.txt
uvicorn app.main:app --host 0.0.0.0 --port 8001 --reload

Docker build
docker build -t ecommerce-product-service .
docker run -p 8001:8001 ecommerce-product-service
