package com.coffeedelivery.coffee_delivery_api.controllers;

import com.coffeedelivery.coffee_delivery_api.models.Coffee;
import com.coffeedelivery.coffee_delivery_api.services.CoffeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coffees")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<Coffee> getAllCoffees() {
        return coffeeService.getCoffees();
    }
}
