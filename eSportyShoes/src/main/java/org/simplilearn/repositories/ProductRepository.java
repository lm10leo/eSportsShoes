package org.simplilearn.repositories;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByCategory(Category category);
}
