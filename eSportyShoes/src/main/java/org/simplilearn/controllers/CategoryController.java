package org.simplilearn.controllers;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.models.CategoryModel;
import org.simplilearn.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/allCategories")
    public String getAllCategories(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "categories"; // Return the view name
    }
    
    @PostMapping("/registercategory")
    public String registerCategory(@RequestParam("cname") String cname, Model model) {
        CategoryModel categoryModel = new CategoryModel(cname);
        Category savedCategory = categoryService.registerCategory(categoryModel);

        if (savedCategory != null) {
            model.addAttribute("msg", cname + " added successfully");
        } else {
            model.addAttribute("msg", "Error registering category");
        }
        return "redirect:/categories/allCategories"; 
    }
}
