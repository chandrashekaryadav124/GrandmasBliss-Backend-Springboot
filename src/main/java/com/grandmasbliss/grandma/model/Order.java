package com.grandmasbliss.grandma.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    private String id;
    private String userId;
    private List<OrderItem> items;
    private double totalAmount;
    private String status; // e.g., "PLACED", "SHIPPED", "DELIVERED"
    private LocalDateTime orderDate;
    private ShippingInfo shippingInfo;
}
