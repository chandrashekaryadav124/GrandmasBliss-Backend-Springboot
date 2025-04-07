package com.grandmasbliss.grandma.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    private String id;
    private String userId;
    private String productId;
    private int quantity;
}

