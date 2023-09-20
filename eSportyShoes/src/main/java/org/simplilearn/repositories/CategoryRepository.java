package org.simplilearn.repositories;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {



}