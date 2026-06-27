package com.example.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Survey {
    private int id;
    private String  name;

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
        return "Survey{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        this.id=87887;
        this.name="land survey";
    }
}
