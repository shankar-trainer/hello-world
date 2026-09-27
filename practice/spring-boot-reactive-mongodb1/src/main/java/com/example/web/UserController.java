package com.example.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Mono;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import com.example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Flux<ResponseEntity<User>> getAllUsers() {
        return userRepository.findAll().map(user -> ResponseEntity.status(HttpStatus.FOUND).body(user));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<User>> getUserById(@PathVariable String id) {
        return userRepository.findById(id).map(u -> ResponseEntity.status(HttpStatus.OK).body(u))
                .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono createUser(@RequestBody User user) {
        return userRepository.save(user)
                // Using .status(HttpStatus.CREATED) or a custom integer status code
                .map(savedUser -> ResponseEntity.status(HttpStatus.CREATED).body(savedUser));
        //return userRepository.save(user);
    }

}
