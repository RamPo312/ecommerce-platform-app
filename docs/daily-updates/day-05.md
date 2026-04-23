# Day 05 — Docker Compose Integration

## Goal
Today my goal was to connect the frontend, product-service, and order-service together using Docker Compose so the application could run locally as a multi-service system.

---

## What I did today
I created a `docker-compose.yml` file in the root of the application repository and added all three services into it:
- frontend
- product-service
- order-service

Each service was configured to build from its own Dockerfile and run on its own port:
- frontend on 3000
- product-service on 8001
- order-service on 8002

At this stage, I kept the setup simple and focused only on getting all services running together in one local environment. I did not add databases yet because I wanted to make sure the container build and service startup were working correctly first.

After creating the compose file, I built and started all services using Docker Compose and verified the application endpoints from the browser.

This step helped move the project from individual service development into an actual microservices setup.

---

## Files created or updated
- docker-compose.yml
- .env.example (optional update)

---

## Commands used

### Docker Compose commands
```bash
cd ecommerce-platform-app

docker compose up --build
docker compose up -d
docker compose ps
docker compose logs
docker compose logs frontend
docker compose logs product-service
docker compose logs order-service
docker compose down
