package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.entities.Product;
import org.simplilearn.repositories.CategoryRepository;
import org.simplilearn.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product addProduct(Product product) {
        
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByCategory(Category category) {
        if (category != null) {
            return productRepository.findByCategory(category);
        } else {
            return null; 
        }
    }

    @Override
    public List<Product> getAllProductsByCategory() {
        
        return productRepository.findAll(); // Replace with the actual logic
    }
}
