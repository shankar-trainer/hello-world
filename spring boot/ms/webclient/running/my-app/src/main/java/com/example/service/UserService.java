package com.example.service;

import com.example.dao.UserRepository;
import com.example.exeception.UserException;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

   /* public List<User> getUserList() {
        if (repository.findAll().isEmpty())
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("list is empty");
        return repository.findAll();
    }*/

    public List<User> findUserList1() {
        if (repository.findAll().isEmpty())
            throw new UserException("list is empty");
        else
            return repository.findAll();
    }

    public User findUser(int id) {
        if (repository.findById(id).isEmpty())
            throw new UserException("id not found");
        else
            return repository.findById(id).get();
    }

    public User addUser(User user) {
        if (repository.findById(user.getUserId()).isEmpty())
            return repository.save(user);
        else
            throw new UserException("user with id already present");
    }

    public User deleteUser(int id) {
        if (repository.findById(id).isPresent()) {
            User user = repository.findById(id).get();
            repository.deleteById(id);
            return user;
        } else
            throw new UserException("user with id not  present");
    }

    public User updateUser(User user) {
        if (repository.findById(user.getUserId()).isPresent())
            return repository.save(user);
        else
            throw new UserException("user with id not present");
    }
}
