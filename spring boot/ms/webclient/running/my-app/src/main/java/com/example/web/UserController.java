package com.example.web;

import com.example.exeception.UserException;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/user1")
    public Mono<User> getUser() {
        User user1 = User.builder().userId(87677676).name("amit kumar").build();
        return Mono.just(user1);
    }

    @GetMapping("/user2")
    public Flux<User> getUser1() {
        User user1[] = new User[]{
                User.builder().userId(87677676).name("amit kumar").build(),
                User.builder().userId(87677676).name("amit kumar").build(),
                User.builder().userId(87677676).name("amit kumar").build(),
        };
        return Flux.just(user1);
    }

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> findUserList1() {
        try {
            return new ResponseEntity<>(userService.findUserList1(), HttpStatus.FOUND);
        } catch (UserException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> findUser(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(userService.findUser(id), HttpStatus.FOUND);
        } catch (UserException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody  User user) {
        try {
            return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
        } catch (UserException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.FOUND);
        } catch (UserException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        try {
            return new ResponseEntity<>(userService.updateUser(user), HttpStatus.CREATED);
        } catch (UserException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.FOUND);
        }
    }
}
