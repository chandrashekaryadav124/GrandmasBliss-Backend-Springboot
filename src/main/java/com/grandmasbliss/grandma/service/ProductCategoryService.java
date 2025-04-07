package com.grandmasbliss.grandma.service;

import com.grandmasbliss.grandma.model.ProductCategory;
import com.grandmasbliss.grandma.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    public ProductCategory createCategory(ProductCategory category) {
        return categoryRepository.save(category);
    }

    public Optional<ProductCategory> getCategoryById(String id) {
        return categoryRepository.findById(id);
    }

    public List<ProductCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    public ProductCategory updateCategory(String id, ProductCategory updatedCategory) {
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setName(updatedCategory.getName());
                    category.setDescription(updatedCategory.getDescription());
                    return categoryRepository.save(category);
                }).orElse(null);
    }

    public void deleteCategory(String id) {
        categoryRepository.deleteById(id);
    }
}
