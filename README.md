# 🛠️ Spring Boot Configuration Management with Spring Cloud Config Server & RabbitMQ

This project demonstrates **centralized configuration management** for multiple **Spring Boot microservices** using **Spring Cloud Config Server** and **RabbitMQ** for **dynamic property refresh**.

---

## 🚀 Overview

Managing configuration across multiple environments and microservices can be complex.  
Spring Cloud Config Server allows you to **store configuration files in a GitHub repository** and serve them to all your Spring Boot clients.  
With **Spring Cloud Bus + RabbitMQ**, configuration updates can be **broadcast dynamically** to all services without restarting them.

---

## 🧩 Architecture

            ┌────────────────────────┐
            │   GitHub Repo (Configs)│
            │ application.yml, etc.  │
            └──────────┬─────────────┘
                       │
                       ▼
            ┌────────────────────────┐
            │  Spring Cloud Config   │
            │        Server          │
            └──────────┬─────────────┘
                       │
                       ▼
            ┌────────────────────────┐
            │ Spring Boot Clients    │
            │ service-a, service-b   │
            └──────────┬─────────────┘
                       │
                       ▼
            ┌────────────────────────┐
            │       RabbitMQ         │
            │ (Spring Cloud Bus)     │
            └────────────────────────┘

---

## ⚙️ Tech Stack

| Component | Description |
|------------|-------------|
| **Spring Boot** | Core framework for building microservices |
| **Spring Cloud Config Server** | Centralized external configuration management |
| **Spring Cloud Bus** | Propagates config changes across services |
| **RabbitMQ** | Message broker for broadcasting refresh events |
| **GitHub** | Remote configuration repository |

---


