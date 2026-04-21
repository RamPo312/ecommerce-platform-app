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

## Status
Day 1 completed: repository structure and project planninig
