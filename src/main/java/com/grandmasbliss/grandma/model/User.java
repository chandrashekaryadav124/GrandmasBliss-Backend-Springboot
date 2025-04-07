package com.grandmasbliss.grandma.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;

    private String phone;
    private String address;

    private String city;
    private String state;
    private String postalCode;
    private String country;

    private boolean admin = false;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    private List<String> wishlist; // List of product IDs
    private List<String> orderHistory; // List of order IDs
}
