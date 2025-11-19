package com.example.web;

import com.example.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    WebClient webClient = WebClient.create("http://localhost:6060/user");

    @GetMapping("/find/{id}")
    public Mono<User> findUserById(@PathVariable("id") int id) {
        log.info("find by id  with web client");
        return webClient.get().uri("/find/"+id).retrieve().bodyToMono(User.class);
    }
    @GetMapping("/all")
    public Flux<User> findUserList() {
        log.info("find all  with web client");
        return webClient.get().uri("/all").retrieve().bodyToFlux(User.class);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<User> deleteUserById(@PathVariable("id") int id) {
        log.info("find by id  by web client");
        return webClient.delete().uri("/delete/"+id).retrieve().bodyToMono(User.class);
    }

    @PostMapping("/add")
    public Mono<User> addUser(@RequestBody User user) {
        log.info("add user  by web client");
        return webClient.post().uri("/add").syncBody(user).retrieve().bodyToMono(User.class);
    }
    @PutMapping("/update")
    public Mono<User> updateUser(@RequestBody User user) {
        log.info("update user  by web client");
        return webClient.put().uri("/add").syncBody(user).retrieve().bodyToMono(User.class);
    }
}
