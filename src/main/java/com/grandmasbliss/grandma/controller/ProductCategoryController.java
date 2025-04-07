package com.grandmasbliss.grandma.controller;

import com.grandmasbliss.grandma.model.ProductCategory;
import com.grandmasbliss.grandma.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "*")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService categoryService;

    @PostMapping
    public ProductCategory createCategory(@RequestBody ProductCategory category) {
        return categoryService.createCategory(category);
    }

    @GetMapping("/{id}")
    public Optional<ProductCategory> getCategoryById(@PathVariable String id) {
        return categoryService.getCategoryById(id);
    }

    @GetMapping
    public List<ProductCategory> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PutMapping("/{id}")
    public ProductCategory updateCategory(@PathVariable String id, @RequestBody ProductCategory category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable String id) {
        categoryService.deleteCategory(id);
    }
}
