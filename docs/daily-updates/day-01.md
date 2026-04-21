# Day 01 — Project Foundation and Repository Setup

## Goal
Set up the overall project structure and define the main repositories, services, and implementation direction for the e-commerce platform.

## What I completed
- Created the application repository structure
- Created the infrastructure repository structure
- Created the GitOps repository structure
- Defined the three core services:
  - frontend in Node.js
  - product-service in Python
  - order-service in Java
- Created base README files
- Created daily update tracking structure

## Why this step is important
This step establishes a clean separation between application code, infrastructure code, and deployment manifests. It makes the project easier to manage, easier to scale, and closer to how real organizations structure platform projects.

## Service ownership
- Frontend handles user interaction and API calls
- Product service manages product catalog operations
- Order service handles order creation and order management

## Planned environments
- dev
- qa

## Planned platform components
- Docker Compose for local development
- GitHub Actions for CI
- Terraform for infrastructure
- Amazon EKS for Kubernetes
- Argo CD for GitOps deployment
- Argo Rollouts for Blue/Green strategy
- ALB Ingress for application exposure
- Route 53 for DNS
- Prometheus and Grafana for metrics
- ELK and CloudWatch for logging and monitoring
- IAM and AWS Secrets Manager for security
- Ansible and shell scripting for automation

## Challenges faced
- Deciding how to split repositories clearly
- Deciding the language assignment for each service

## How I solved them
I separated the project into app, infra, and GitOps repositories to keep concerns isolated. I selected Node.js, Python, and Java intentionally to demonstrate a polyglot microservices architecture.

## Next step
Start Day 02 by initializing the Node.js frontend service skeleton.
