package com.grandmasbliss.grandma.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    private String id;
    private String productId;
    private String userId;
    private String userName;
    private int rating; // from 1 to 5
    private String comment;
    private LocalDateTime reviewDate;
}
