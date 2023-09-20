package org.simplilearn.services;

import java.util.List;
import org.simplilearn.entities.Category;
import org.simplilearn.models.CategoryModel;
import org.simplilearn.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public Category registerCategory(CategoryModel categoryModel) {
        
        Category category = new Category();
        category.setCname(categoryModel.getName());
        

        
        return categoryRepository.save(category);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Category> getAllCategories() {
        
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}
