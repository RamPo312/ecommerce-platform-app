package com.ecommerce.orderservice.controller;

import com.ecommerce.orderservice.model.OrderEntity;
import com.ecommerce.orderservice.repository.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

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
        List<OrderEntity> orders = orderRepository.findAll();

        Map<String, Object> response = new HashMap<>();
        response.put("count", orders.size());
        response.put("items", orders);
        return response;
    }
}
