# Day 06 — Database Integration

## Goal
Today my goal was to make the product-service and order-service more realistic by connecting them to databases instead of returning only static data.

---

## What I did today
I added PostgreSQL databases for both backend services and updated the Docker Compose setup so each service has its own database.

For the product-service, I used SQLAlchemy with PostgreSQL and created a simple `products` table. I also added initial sample product records during startup so the API can return actual database data.

For the order-service, I added Spring Data JPA and PostgreSQL support. I created an `OrderEntity`, a repository layer, and a startup data loader so sample orders are inserted automatically when the service runs for the first time.

Then I updated the Docker Compose file to add:
- `product-db`
- `order-db`

and connected each backend service to its own database container.

This made the overall setup closer to a real microservices architecture, where each service owns its own data store.

---

## Files created or updated
- product-service/app/database.py
- product-service/app/models.py
- product-service/app/main.py
- product-service/requirements.txt
- order-service/pom.xml
- order-service/src/main/java/com/ecommerce/orderservice/model/OrderEntity.java
- order-service/src/main/java/com/ecommerce/orderservice/repository/OrderRepository.java
- order-service/src/main/java/com/ecommerce/orderservice/config/DataLoader.java
- order-service/src/main/java/com/ecommerce/orderservice/controller/OrderController.java
- order-service/src/main/resources/application.properties
- docker-compose.yml

---

## Commands used

### Product service dependency update
```bash
cd ecommerce-platform-app/product-service

# Activate venv if already created
venv\Scripts\activate

pip install sqlalchemy psycopg2-binary
pip freeze > requirements.txt
