package com.example.model;

import lombok.Data; // Using Lombok for brevity

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
