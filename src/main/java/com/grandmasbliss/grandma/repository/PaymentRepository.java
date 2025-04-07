package com.grandmasbliss.grandma.repository;


import com.grandmasbliss.grandma.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
