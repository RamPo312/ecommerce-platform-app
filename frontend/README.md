# Frontend Service

## Overview
This service is the frontend entry point of the e-commerce platform. It is built with Node.js and Express.

## Responsibilities
- Accept incoming user requests
- Serve as the frontend service foundation
- Later communicate with product-service and order-service

## Endpoints
- `GET /` - basic service response
- `GET /health` - health check endpoint

## Run locally
```bash
npm install
npm run dev
