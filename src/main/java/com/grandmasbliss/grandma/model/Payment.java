package com.grandmasbliss.grandma.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    private String id;

    private String userId;
    private String orderId;
    private double amount;
    private String paymentMethod; // e.g., "Credit Card", "UPI", "Cash on Delivery"
    private String paymentStatus; // e.g., "Pending", "Completed", "Failed"
    private LocalDateTime paymentDate;
}
