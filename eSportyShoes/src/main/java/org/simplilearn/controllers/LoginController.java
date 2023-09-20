package org.simplilearn.controllers;

import javax.servlet.http.HttpSession;

import org.simplilearn.entities.User;
import org.simplilearn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/showLogin")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String handleLogin(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
	    User user = userRepository.findByUsernameAndPassword(username, password);
	    if (user != null && user.getPassword().equals(password)) {
	        session.setAttribute("user", user);
	        return "redirect:/products";
	    } else {
	        model.addAttribute("error", "Invalid username or password");
	        return "redirect:/showLogin";
	    }
	}
	
	

	
	
	
	
	/*@GetMapping("/categories")
	public String showCategories() {
	    return "categories";
	}*/
	@GetMapping("/products")
	public String showProducts() {
	    return "products";
	}
	
}



