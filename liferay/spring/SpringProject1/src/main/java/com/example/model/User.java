package com.example.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "user1"
)
public class User {
    private int id;
    private String name;

    //    @Autowired
    private Profile profile;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profile=" + profile +
                '}';
    }

    @PostConstruct
    public void init() {
        this.id = 878787;
        this.name = "aman varma";
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

    public Profile getProfile() {
        return profile;
    }

    @Autowired
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
