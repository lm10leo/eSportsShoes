package org.simplilearn.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.simplilearn.entities.User;
import org.simplilearn.repositories.UserRepository;
import org.simplilearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService; // Inject the userService here

    @GetMapping("/showAdmin")
    public String showAdminLoginPage() {
        return "adminLogin"; // Use a different JSP page for admin login
    }
    @GetMapping("/adminDashboard")
    public String admindashboard(Model model) {
        return "adminDashboard";
    }


    @PostMapping("/adminLogin")
    public String handleAdminLogin(@RequestParam String username, @RequestParam String password, Model model,
            HttpSession session) {
        if ("shailesh".equals(username) && "admin".equals(password)) {
            User user = new User();
            user.setUsername(username);

            
            session.setAttribute("user", user);

            return "redirect:/adminDashboard";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "adminLogin";
        }
    }

    @GetMapping("/showUsers")
    public String showDashboard(Model model) {
        List<User> users = userService.getAllUsers(); // Use the userService instance
        System.out.println("Number of users retrieved: " + users.size()); // Debugging statement
        model.addAttribute("users", users);
        return "users";
    }

}
