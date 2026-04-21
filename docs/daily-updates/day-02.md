# Day 02 — Frontend Service Initialization

## Goal
Initialize the Node.js frontend service and prepare the basic structure for future integration with backend microservices.

## What I completed
- Initialized the frontend Node.js project
- Installed Express
- Installed Nodemon for local development
- Created the main application entry file
- Added root endpoint
- Added health endpoint
- Created the Dockerfile
- Updated frontend README

## Repository structure created
- frontend/src/index.js
- frontend/tests/
- frontend/package.json
- frontend/Dockerfile
- frontend/README.md

## Commands used
```bash
cd ecommerce-platform-app/frontend

npm init -y
npm install express
npm install --save-dev nodemon

mkdir -p src tests
touch src/index.js Dockerfile README.md

npm run de

#### Docker commands used
docker build -t ecommerce-frontend .
docker run -p 3000:3000 ecommerce-frontendv
