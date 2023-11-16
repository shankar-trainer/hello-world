package com.example.SpringEx1.service;

import com.example.SpringEx1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    User user;
    
    public User getUser(){
       return  user; 
    }
}