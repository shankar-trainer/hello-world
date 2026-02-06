package com.cts.model;

import jakarta.annotation.PostConstruct;

public class User {
    private int userId;
    private String  userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
    public User(){

    }

    @PostConstruct
    public void startup(){
        System.out.println("user init called");
        this.userId=98988;
        this.userName="virendra";
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
