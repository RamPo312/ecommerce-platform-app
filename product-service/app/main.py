from fastapi import FastAPI

app = FastAPI(title="Product Service", version="1.0.0")


products = [
    {"id": 1, "name": "Laptop", "price": 75000},
    {"id": 2, "name": "Headphones", "price": 2500},
    {"id": 3, "name": "Keyboard", "price": 1800}
]


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
    return {
        "count": len(products),
        "items": products
    }
