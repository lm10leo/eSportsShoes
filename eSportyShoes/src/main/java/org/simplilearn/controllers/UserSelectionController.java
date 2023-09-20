package org.simplilearn.controllers;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.simplilearn.entities.UserSelection;
import org.simplilearn.services.UserSelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user-selections")
public class UserSelectionController {
    @Autowired
    private UserSelectionService userSelectionService;

    @PostMapping("/save")
    public String saveUserSelection(HttpServletRequest request, UserSelection userSelection) {
        String username = request.getParameter("username");
        userSelection.setUsername(username);
        userSelection.setSelectedDate(LocalDate.now());

        
        userSelectionService.saveUserSelection(userSelection);

      
        return "redirect:/products/allproducts";
    }
}