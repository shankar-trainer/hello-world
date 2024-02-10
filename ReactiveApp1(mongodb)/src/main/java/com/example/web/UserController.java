package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserRepository;
import com.example.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/hello") 
    public String hello(){
    return "hello ";
    }

    @GetMapping("/user")
    public User getUser(){
       return  User.builder().name("ram kumar").userId("10001").build();
    }

    @GetMapping("/user1")
    public Mono<User> getUser1(){
       return  Mono.just(User.builder().name("ram kumar").userId("10001").build());
    }
    
    @GetMapping("/alluser")
    public List<User> getUsers(){
     return   repository.findAll();
    }

    @GetMapping("/alluser1")
    public Flux<List<User>> getUsers1(){
     return   Flux.just(repository.findAll());
    }

}
