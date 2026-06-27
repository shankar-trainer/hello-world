package com.example.controller;

import com.example.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class UserController {
    private List<User> userList = new ArrayList<>();
    private long counter = 1;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userList);
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/add")
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("users", userList);
            return "index"; // Return to view with JSR-303 error messages
        }
        user.setId(counter++);
        userList.add(user);
        return "redirect:/";
    }

    @GetMapping("/remove/{id}")
    public String removeUser(@PathVariable Long id) {
        userList.removeIf(u -> u.getId().equals(id));
        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam("keyword") String keyword, Model model) {
        List<User> filtered = userList.stream().filter(u -> u.getName().toLowerCase().contains(keyword.toLowerCase()) || u.getEmail().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
        model.addAttribute("users", filtered);
        model.addAttribute("user", new User());
        model.addAttribute("keyword", keyword);
        return "index";
    }
}
