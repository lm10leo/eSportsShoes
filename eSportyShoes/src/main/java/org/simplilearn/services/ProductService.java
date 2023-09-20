package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.entities.Product;

public interface ProductService	 {

	Product addProduct(Product product);
    List<Product> getAllProducts();
    List<Product> findByCategory(Category category);
	List<Product> getAllProductsByCategory();
	
}
