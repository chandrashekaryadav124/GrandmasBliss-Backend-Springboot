package com.grandmasbliss.grandma.model;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingInfo {
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private String state;
    private String zipCode;
    private String deliveryInstructions;
    private String deliveryOption; // Free, Standard, Express
}

