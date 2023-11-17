package com.example.SpringEx1.model;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private int id;
    private String name;

    @PostConstruct
    public void init() {
        this.id = 1001;
        this.name = "shyam kumar";
    }
}