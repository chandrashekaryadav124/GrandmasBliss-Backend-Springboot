package com.grandmasbliss.grandma.repository;

import com.grandmasbliss.grandma.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByCategoryId(String categoryId);
    
    // NEW: Filter by type (e.g., "sweets", "veg-pickle", "nonveg-pickle")
    List<Product> findByType(String type);
}
