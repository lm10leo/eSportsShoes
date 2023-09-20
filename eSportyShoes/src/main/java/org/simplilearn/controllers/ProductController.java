package org.simplilearn.controllers;

import java.util.List;

import org.simplilearn.entities.Category;
import org.simplilearn.entities.Product;
import org.simplilearn.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/allproducts")
    public String listProductsByCategory(Model model) {
        List<Product> products = productService.getAllProductsByCategory(); // Implement this method in your service
        model.addAttribute("products", products);
        return "products";
    }
    

    @PostMapping("/addProduct")
    public String addProduct(
        @RequestParam("shoe") String shoe,
        @RequestParam("price") int price,
        @RequestParam("imageUrl") String imageUrl,
        @RequestParam("category_cid") Long categoryCid, 
        Model model
    ) {
        Product product = new Product();
        product.setShoe(shoe);
        product.setPrice(price);
        product.setImageUrl(imageUrl);

        
        Category category = new Category();
        category.setCid(categoryCid);
        product.setCategory(category);

        Product savedProduct = productService.addProduct(product);

        if (savedProduct != null) {
            model.addAttribute("msg", shoe + " registered successfully");
        } else {
            model.addAttribute("msg", "Error adding product");
        }
        
        return "redirect:/products/allproducts";
    }
}