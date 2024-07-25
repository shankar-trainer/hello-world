package com.example.web;

import java.util.List;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String hello() {
        return "hello ";
    }

    @GetMapping("/user")
    public User getUser() {
        return User.builder().name("ram kumar").id("10001").build();
    }

    @GetMapping("/userbyid/{id}")
    public User getUser1(@PathVariable("id") String id) {
        return repository.findById(id).get();
    }
//http://localhost:8080/userbyidandname1/10001?name=ram kumar
    @GetMapping("/userbyidandname1/{id}")
    public User getUser2(@PathVariable("id") String id, @RequestParam("name") String name) {
        return repository.findByIdAndName(id, name);
    }

    //http://localhost:8080/userbyidandname2/10001/ram kumar
    @GetMapping("/userbyidandname2/{id}/{name}")
    public User getUser3(@PathVariable("id") String id, @PathVariable("name") String name) {
        return repository.findByIdAndName(id, name);
    }

    //http://localhost:8080/userbyidandname3/10001/ram kumar
    @GetMapping("/userbyidandname3/{id}/{name}")
    public Mono<User> getUser4(@PathVariable("id") String id, @PathVariable("name") String name) {
        return Mono.just(repository.findByIdAndName(id, name));
    }

    @GetMapping("/user1")
    public Mono<User> getUser1() {
        return Mono.just(User.builder().name("ram kumar").id("10001").build());
    }

    @GetMapping("/alluser")
    public List<User> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/alluser1")
    public Flux<List<User>> getUsers1() {
        return Flux.just(repository.findAll());
    }

    @GetMapping("/alluser2")
    public List<User> getUsers2() {
        return repository.findAll();
    }

}
