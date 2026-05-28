package com.example.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private String name;

    @PostConstruct
    public void init() {
        this.id = 8878787;
        this.name = "vimal kumar";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
