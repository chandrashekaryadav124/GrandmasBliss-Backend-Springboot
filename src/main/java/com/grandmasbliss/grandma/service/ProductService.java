package com.grandmasbliss.grandma.service;

import com.grandmasbliss.grandma.model.Product;
import com.grandmasbliss.grandma.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    // ✅ NEW: Filter products by type
    public List<Product> getProductsByType(String type) {
        return productRepository.findByType(type);
    }

    public Product updateProduct(String id, Product updatedProduct) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setDescription(updatedProduct.getDescription());
                    product.setPrice(updatedProduct.getPrice());
                    product.setImageUrl(updatedProduct.getImageUrl());
                    product.setCategoryId(updatedProduct.getCategoryId());
                    product.setVeg(updatedProduct.isVeg());
                    product.setType(updatedProduct.getType()); // ✅ Set type too
                    return productRepository.save(product);
                }).orElse(null);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
