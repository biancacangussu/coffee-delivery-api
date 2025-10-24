package com.coffeedelivery.coffee_delivery_api.controllers;

import com.coffeedelivery.coffee_delivery_api.models.Order;
import com.coffeedelivery.coffee_delivery_api.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        System.out.println("🔥 POST recebido em /api/orders!");
        System.out.println("📦 Pedido recebido: " + order);

        Order savedOrder = orderService.saveOrder(order);

        System.out.println("✅ Pedido salvo: " + savedOrder);
        return ResponseEntity.ok(savedOrder);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        System.out.println("📋 GET em /api/orders — total de pedidos: " + orders.size());
        return ResponseEntity.ok(orders);
    }
}
