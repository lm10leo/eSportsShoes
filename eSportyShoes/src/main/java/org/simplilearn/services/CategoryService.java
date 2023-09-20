package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.entities.User;
import org.simplilearn.models.CategoryModel;
import org.simplilearn.models.UserModel;

public interface CategoryService {


	Category registerCategory (CategoryModel  categoryModel);
	
	  
	  List<Category> getAllCategories();
}
