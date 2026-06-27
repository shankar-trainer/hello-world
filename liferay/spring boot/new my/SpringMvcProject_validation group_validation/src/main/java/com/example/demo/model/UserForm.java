package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import com.example.demo.validation.ExtendedValidationGroup;

public class UserForm {

    private String id; // No validation constraints for search

    @NotBlank(message = "Name is required for saving!", groups = ExtendedValidationGroup.class)
    @Size(min = 2, message = "Name must be at least 2 characters!", groups = ExtendedValidationGroup.class)
    private String name;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}