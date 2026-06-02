package com.example.demo.controller;

import com.example.demo.model.UserForm;
import com.example.demo.validation.ExtendedValidationGroup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(ModelMap model) {
        model.addAttribute("userForm", new UserForm());
        return "index";
    }

    // 1. SAVE: JSR-303 Validation is ENABLED here using the group
    @PostMapping(value = "/user", params = "action=save")
    public String saveUser(@Validated(ExtendedValidationGroup.class) @ModelAttribute("userForm") UserForm form, 
                           BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("message", "Validation failed!");
            return "index";
        }
        model.addAttribute("message", "User " + form.getName() + " saved successfully!");
        return "index";
    }

    // 2. SEARCH BY ID: Validation is DISABLED (Ignored)
    @PostMapping(value = "/user", params = "action=search")
    public String searchUser(@ModelAttribute("userForm") UserForm form, Model model) {
        // No @Validated annotation means JSR-303 is bypassed
        model.addAttribute("message", "Searching for ID: " + form.getId());
        return "index";
    }

    // 3. SHOW ALL: Validation is DISABLED (Ignored)
//    @PostMapping(value = "/user", params = "action=showAll")
//    public String showAllUsers(Model model) {
//        model.addAttribute("message", "Displaying all users...");
//        return "index";
//    }
    
 // 3. SHOW ALL: Validation is DISABLED (Ignored)
    @PostMapping(value = "/user", params = "action=showAll")
    public String showAllUsers(@ModelAttribute("userForm") UserForm form, Model model) {
        // Spring automatically adds 'userForm' to the model now
        model.addAttribute("message", "Displaying all users...");
        return "index";
    }
}



