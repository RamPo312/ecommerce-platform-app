package com.ecommerce.orderservice.config;

import com.ecommerce.orderservice.model.OrderEntity;
import com.ecommerce.orderservice.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OrderRepository orderRepository;

    public DataLoader(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) {
        if (orderRepository.count() == 0) {
            orderRepository.save(new OrderEntity("Laptop", 1, "CREATED"));
            orderRepository.save(new OrderEntity("Headphones", 2, "CREATED"));
        }
    }
}
