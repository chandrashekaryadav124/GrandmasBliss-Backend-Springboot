package com.grandmasbliss.grandma.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String categoryId; // Reference to ProductCategory
    private boolean isVeg;
    private String type; // NEW: "sweets", "veg-pickle", "nonveg-pickle", etc.
}
