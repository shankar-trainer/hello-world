package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name = "users")
//@Component
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
    private String roles;
}

