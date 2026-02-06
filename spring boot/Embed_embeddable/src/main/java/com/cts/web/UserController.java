package com.cts.web;

import com.cts.dao.UserRepository;
import com.cts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserRepository repository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/user")
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @GetMapping("/user/{name}")
    public List<User> getAllUserByName(@PathVariable String name) {
        return repository.findByuserName(name);
    }

    @GetMapping("/user/{id}/{name}")
    public List<User> getAllUserByIdAndName(@PathVariable int id, @PathVariable String name) {
        return repository.findByuserIdAnduserName(id, name);
    }

    @GetMapping("/user1")
    public List<User> searchByUserNameSortByName() {
        return repository.findByuserNameOrderByuserName();
    }

    @GetMapping("/user2")
    public List<User> searchByUserNameSortByNameDesc() {
        return repository.findByuserNameOrderByuserNameDesc();
    }

    @PutMapping("/user2/{id}/name")
    public void updateUserByIdandName(@PathVariable int id, @PathVariable String name) {
         repository.updateByIdandName(name, id);

    }

    @DeleteMapping("/user3/{name}")
    public void deleteByName(String name) {
        repository.deleteByName(name);
    }

}
