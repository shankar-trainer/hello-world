package com.example.service;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(String name) {
        System.out.println("User " + name + " created successfully!");
    }
}