package com.coffeedelivery.coffee_delivery_api.services;

import com.coffeedelivery.coffee_delivery_api.models.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public Order saveOrder(Order order) {
        orders.add(order);
        return order;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
