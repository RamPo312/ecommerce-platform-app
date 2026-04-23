package com.ecommerce.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/")
    public Map<String, String> root() {
        return Map.of(
                "service", "order-service",
                "message", "Order service is running successfully"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "service", "order-service"
        );
    }

    @GetMapping("/orders")
    public Map<String, Object> getOrders() {
        List<Map<String, Object>> orders = List.of(
                Map.of("id", 1, "product", "Laptop", "quantity", 1, "status", "CREATED"),
                Map.of("id", 2, "product", "Headphones", "quantity", 2, "status", "CREATED")
        );

        return Map.of(
                "count", orders.size(),
                "items", orders
        );
    }
}
