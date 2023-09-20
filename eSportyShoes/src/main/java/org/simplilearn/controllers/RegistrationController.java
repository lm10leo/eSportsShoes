package org.simplilearn.controllers;

import org.simplilearn.entities.User;
import org.simplilearn.models.UserModel;
import org.simplilearn.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

	private UserService userService;

	public RegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
@GetMapping("/")	
	public String showHome() {
		return "home";
	}
@GetMapping("/showRegister")
    public String showRegister() {
	return "register";
}
	
@PostMapping("/register")
public String register(@RequestParam("username") String username, @RequestParam("password") String password,
                       @RequestParam("email") String email, @RequestParam("firstName") String firstName,
                       @RequestParam("lastName") String lastName, Model model) {
    String viewname;
    UserModel userModel = new UserModel(username, password, email, firstName, lastName);
    User savedUser = userService.registerUser(userModel);

    if (savedUser != null) {
        model.addAttribute("msg",    username+" registered succesfully ");
        viewname = "home";
    } else {
        model.addAttribute("msg", "Error registering user");
        viewname = "register";
    }
    return viewname;
}


}
