package com.grandmasbliss.grandma.repository;


import com.grandmasbliss.grandma.model.ProductCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCategoryRepository extends MongoRepository<ProductCategory, String> {
}
