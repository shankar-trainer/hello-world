package com.example.service;

import com.example.dao.UserDao;
import com.example.exception.UserException;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao dao;


    public Map<Integer, User> getAllUser() throws UserException {
        Map<Integer, User> allUser = dao.getAllUser();
        if (allUser.size() == 0)
            throw new UserException(" User list is empty");
        else
            return allUser;
    }

    public User removeUser(int id) throws UserException {
        User u = dao.removeUser(id);
        if (u == null)
            throw new UserException(" id not present");
        else
            return u;
    }

    public User addUser(User user) throws UserException {
        User u = dao.addUser(user);
        if (u == null)
            throw new UserException("user with id already  present");
        else
            return u;
    }

    public User searchUser(int id) throws UserException {
        if (dao.searchUser(id) == null) {
            throw new UserException("id not present");
        } else
            return dao.searchUser(id);
    }

    public User updateUser(User user) throws UserException {
        User user1 = dao.updateUser(user);
        if (user1 == null)
            throw new UserException("user not   present");
        else
            return user1;
    }
}
