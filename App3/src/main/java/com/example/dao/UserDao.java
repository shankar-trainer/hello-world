package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    Map<Integer, User> userMap;

    public UserDao() {
        userMap = new HashMap<>();
    }

    public User addUser(User user) {
        if (searchUser(user.getUserId()) == null) {
            userMap.put(user.getUserId(), user);
            return  user;
        }
        else
            return null;
    }

    public User searchUser(int id) {
        if (userMap.containsKey(id))
            return userMap.get(id);
        else
            return null;
    }

    public Map<Integer, User> getAllUser() {
        return userMap;
    }


}
