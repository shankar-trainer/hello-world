package com.cts.controller;

import com.cts.dao.UserRepository;
import com.cts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserRepository repsitory;

    @GetMapping("/user")
    public ResponseEntity<List<?>> getAllUser1() {
        if (repsitory.findAll().isEmpty())
//            return  ResponseEntity.notFound().build();
//            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("list is empty"));
        else
//            return new ResponseEntity(repsitory.findAll(), HttpStatus.OK);
            return ResponseEntity.status(HttpStatus.OK).body(repsitory.findAll());
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
//        return new ResponseEntity<>(repsitory.save(user), HttpStatus.OK);

        return ResponseEntity.status(HttpStatus.CREATED).body(repsitory.save(user));
//        return  ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping("/user2/{id}")
    public ResponseEntity<?> searchUserById(@PathVariable("id") long id) {
        if (repsitory.findById(id).isPresent())
            return new ResponseEntity<User>(repsitory.findById(id).get(), HttpStatus.OK);
        else
//            return new   ResponseEntity("id  not found",HttpStatus.NOT_FOUND);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("id not found"));

    }

    @GetMapping("/user/{name}")
    public User searchUserByName(@PathVariable("name") String name) {
        return repsitory.findByUserName(name);
    }


    @GetMapping("/user1/{name}")
    public User searchUserByName1(@PathVariable("name") String name) {
        return repsitory.searchByUserName(name);
    }


    @GetMapping("/user/{id}/{name}")
    public User searchUserByIdAndName(@PathVariable("id") long id, @PathVariable("name") String name) {
        return repsitory.findByUserIdAndUserName(id, name);
    }

    @GetMapping("/user1/dob/{dob}")
    public List<User> searchUserByDob(@PathVariable("dob") LocalDate dob) {
    	System.out.println("dob "+dob);
        return repsitory.findByUserDob(dob);
    }
    
    @GetMapping("/user2/{name}/{dob}")
    public List<User> searchByUserNameAndDob(@PathVariable  String name ,@PathVariable("dob") LocalDate dob) {
    	return repsitory.searchByUserNameandDob(name,dob);
    }

}
