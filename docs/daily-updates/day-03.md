# Day 03 — Product Service Initialization

## Goal
Today my goal was to initialize the product-service using Python and FastAPI and prepare it as an independent microservice for the e-commerce platform.

---

## What I did today
I started by setting up the product-service folder and creating a Python virtual environment. After that, I installed FastAPI and Uvicorn, which are needed to build and run the service.

Then I created the main application file and added three basic endpoints:
- `/` to confirm the service is running
- `/health` to check service status
- `/products` to return a sample list of products

For now, I used static product data so that I could focus on service structure first. Later, I will connect this service to a database.

I also created a Dockerfile so the service can be containerized and used in Docker Compose, CI/CD, and Kubernetes later.

Finally, I added a README for the product-service and followed the Git feature branch workflow before pushing the code.

---

## Files created
- product-service/app/main.py
- product-service/requirements.txt
- product-service/Dockerfile
- product-service/README.md
- product-service/tests/ (empty for now)

---

## Commands used

### Python service setup
```bash
cd ecommerce-platform-app/product-service

python -m venv venv

# Windows
venv\Scripts\activate

# Linux / Mac
source venv/bin/activate

pip install fastapi uvicorn
pip freeze > requirements.txt

mkdir -p app tests
touch app/main.py Dockerfile README.md
