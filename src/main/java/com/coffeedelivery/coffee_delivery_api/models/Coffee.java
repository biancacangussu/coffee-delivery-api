package com.coffeedelivery.coffee_delivery_api.models;

import java.util.List;

public class Coffee {
    private Long id;
    private List<String> tags;
    private String name;
    private String description;
    private String photo;
    private Double price;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
