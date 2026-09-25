package com.example.dto;

import lombok.Data; // Using Lombok for brevity

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
