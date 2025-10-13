package com.cts.controller;

import com.cts.dao.UserRepsitory;
import com.cts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserRepsitory repsitory;

    @GetMapping("/user")
    public ResponseEntity<List<?>> getAllUser1() {
        if (repsitory.findAll().isEmpty())
//            return  ResponseEntity.notFound().build();
//            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("list is empty"));
        else
//            return new ResponseEntity(repsitory.findAll(), HttpStatus.OK);
            return  ResponseEntity.status(HttpStatus.OK).body(repsitory.findAll());
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(repsitory.save(user), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> searchUserById(@PathVariable("id")  long id) {
        if (repsitory.findById(id).isPresent())
            return new ResponseEntity<User>(repsitory.findById(id).get(), HttpStatus.OK);
        else
//            return new   ResponseEntity("id  not found",HttpStatus.NOT_FOUND);
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("id not found"));

    }
}
