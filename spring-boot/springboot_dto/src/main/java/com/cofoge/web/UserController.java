package com.cofoge.web;

import com.cofoge.model.Address;
import com.cofoge.model.User;
import com.cofoge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(User user){
        return userRepository.save(user);
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/user1")
    public List<User> addUser1(){

       User user[]= new User[]{
                User.builder().userName("aditaya vikram").address(Address.builder().city("chennai").location("thoraipakkam").state("tamilnadu").build()).build(),
                User.builder().userName("aryan sahu").address(Address.builder().city("new delhi").location("palam").state("delhi").build()).build(),

        };
       var userslist= Arrays.asList(user);
       return userRepository.saveAll(userslist);

    }




}
