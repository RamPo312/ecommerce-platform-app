from fastapi import FastAPI
from sqlalchemy.orm import Session
from app.database import Base, engine, SessionLocal
from app.models import Product

app = FastAPI(title="Product Service", version="1.0.0")

Base.metadata.create_all(bind=engine)


def seed_products():
    db: Session = SessionLocal()
    try:
        existing_count = db.query(Product).count()
        if existing_count == 0:
            sample_products = [
                Product(name="Laptop", price=75000),
                Product(name="Headphones", price=2500),
                Product(name="Keyboard", price=1800)
            ]
            db.add_all(sample_products)
            db.commit()
    finally:
        db.close()


seed_products()


@app.get("/")
def root():
    return {
        "service": "product-service",
        "message": "Product service is running successfully"
    }


@app.get("/health")
def health():
    return {
        "status": "UP",
        "service": "product-service"
    }


@app.get("/products")
def get_products():
    db: Session = SessionLocal()
    try:
        products = db.query(Product).all()
        items = [
            {"id": product.id, "name": product.name, "price": product.price}
            for product in products
        ]
        return {
            "count": len(items),
            "items": items
        }
    finally:
        db.close()
