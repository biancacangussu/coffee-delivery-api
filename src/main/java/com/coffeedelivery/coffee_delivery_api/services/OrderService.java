package com.coffeedelivery.coffee_delivery_api.services;

import com.coffeedelivery.coffee_delivery_api.models.Order;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Service
public class OrderService {

    private final JsonBinService jsonBinService;

    public OrderService(JsonBinService jsonBinService) {
        this.jsonBinService = jsonBinService;
    }

    public Order saveOrder(Order order) {
        order.setId(UUID.randomUUID().toString());
        order.setCreatedAt(Instant.now());

        Map<String, Object> data = jsonBinService.getData();

        List<Order> orders = (List<Order>) data.get("orders");

        if (orders == null) {
            orders = new ArrayList<>();
        }

        orders.add(order);
        data.put("orders", orders);

        jsonBinService.updateData(data);

        return order;
    }

    public List<Order> getAllOrders() {
        Map<String, Object> data = jsonBinService.getData();
        return (List<Order>) data.getOrDefault("orders", new ArrayList<>());
    }
}
