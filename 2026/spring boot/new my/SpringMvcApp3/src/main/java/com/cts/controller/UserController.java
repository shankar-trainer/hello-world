package com.cts.controller;

import java.util.Arrays;
import java.util.List;
import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.cts.model.User;

@Controller
public class UserController {

    // Helper method to populate options for Checkboxes, Radios, and Dropdowns
    private void populateFormLists(Model model) {
        model.addAttribute("hobbyList", Arrays.asList("Reading", "Gaming", "Traveling", "Coding"));
        model.addAttribute("gender", Arrays.asList("Male", "Female", "Other"));
        model.addAttribute("cityList", Arrays.asList("New York", "London", "Tokyo", "Bengaluru"));
    }

    // 1. Display the form initially
    @GetMapping("/login")
    public String showForm(Model model) {
        model.addAttribute("user", new User()); // Binding object
        populateFormLists(model);
        return "UserForm"; // Your JSP filename
    }

    // 2. Handle form submission and handle validations
    @PostMapping("/login")
    public String handleLogin(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        
        if (result.hasErrors()) {
            // Validation failed! Repopulate the UI lists so the dropdowns/checkboxes don't break
            populateFormLists(model);
            return "UserForm"; // Redirection back to the form JSP to display errors
        }
        
        return "UserResult"; // Redirect to success page if all validations pass
    }
}