# E-Commerce Platform App

## Overview
This repository contains the application layer of a simple e-commerce platform built using a microservices architecture.

The system is designed using three services written in different technologies:
- Frontend: Node.js
- Product Service: Python
- Order Service: Java

The goal of this project is to implement a real-world DevOps and cloud-native delivery flow, starting from local development with Docker Compose, followed by CI with GitHub Actions, infrastructure provisioning with Terraform, deployment to Amazon EKS using GitOps with Argo CD, Blue/Green rollout strategy, ALB ingress, Route 53 DNS, monitoring, logging, security, and automation.

## Services
- frontend
- product-service
- order-service

## Project Goals
- Build and run microservices locally using Docker Compose
- Implement CI pipeline with linting, testing, Docker build, image scan, and secret scan
- Provision AWS infrastructure using Terraform
- Deploy to EKS using Argo CD and Argo Rollouts
- Expose application using ALB ingress and Route 53
- Implement monitoring with Prometheus, Grafana, ELK, and CloudWatch
- Use IAM and AWS Secrets Manager securely
- Include Ansible and shell scripting realistically

## Commands used
```bash
# Create app repo structure
mkdir -p ecommerce-platform-app/{frontend/{src,tests},product-service/{app,tests},order-service/src,docs/{architecture,api,daily-updates},.github/workflows}
cd ecommerce-platform-app
touch README.md .gitignore .env.example
touch frontend/README.md product-service/README.md order-service/README.md

# Create infra repo structure
mkdir -p ecommerce-platform-infra/{bootstrap/backend-state,modules/{vpc,eks,iam,route53,secrets-manager,monitoring,cloudwatch},environments/{dev,qa},ansible/{inventories,playbooks,roles},scripts}
cd ecommerce-platform-infra
touch README.md .gitignore

# Create GitOps repo structure
mkdir -p ecommerce-platform-gitops/{argocd/{applications,projects},apps/ecommerce/{base,overlays/{dev,qa}},rollouts,ingress,monitoring,logging}
cd ecommerce-platform-gitops
touch README.md .gitignore

# Initialize git
git init
git add .
git commit -m "Initial project structure setup"


# Day 02 — Frontend Service Initialization

## Goal
Today my goal was to initialize the frontend service using Node.js and prepare it so it can run independently and later integrate with other microservices.

---

## What I did today
I started by going into the frontend folder and initializing a Node.js project. Instead of building a full UI, I kept things simple and created a backend-style frontend service using Express.

I added a basic server that runs on port 3000 and created two endpoints:
- `/` to confirm the service is running
- `/health` to check service status (this will be useful later for Docker, Kubernetes, and monitoring)

After that, I added a Dockerfile so this service can be containerized and used in Docker Compose and CI/CD pipelines later.

I also created a separate README file for the frontend service to keep documentation clean and organized.

---

## Files created
- frontend/src/index.js
- frontend/package.json
- frontend/Dockerfile
- frontend/README.md
- frontend/tests/ (empty for now)

---

## Commands used

### Node.js setup
```bash
cd ecommerce-platform-app/frontend

npm init -y
npm install express
npm install --save-dev nodemon

mkdir -p src tests
touch src/index.js Dockerfile README.md

npm run dev
Docker commands
docker build -t ecommerce-frontend .
docker run -p 3000:3000 ecommerce-frontend
Git workflow followed
Step 1 — Create and switch to dev branch
git checkout -b dev
git push -u origin dev
Step 2 — Create feature branch for Day 2 work
git checkout -b feature/frontend-init
Step 3 — Add and commit changes
git add .
git commit -m "Day 2: Initialize Node.js frontend service with Express and Dockerfile"
Step 4 — Push feature branch
git push origin feature/frontend-init
Step 5 — Merge into dev branch
git checkout dev
git merge feature/frontend-init
git push origin dev

What to learn

How to set up a basic Node.js service using Express
Importance of having a /health endpoint for service monitoring
How to create a Dockerfile for a Node.js application
How to follow a proper Git branching strategy (dev + feature branches)

Challenges faced

At first, I was thinking of building a complete UI, but that would have taken more time and distracted from the main goal of setting up microservices.

How I solved them

I decided to keep the frontend simple and treat it as a service first. This helps me focus on architecture and DevOps flow instead of UI complexity.


