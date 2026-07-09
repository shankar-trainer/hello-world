package com.coforge.collection;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    List<User> userList;

    public UserDao(){
        userList=new ArrayList<>();
    }

    public User addUser(User user){
          userList.add(user);
          return  user;
    }
    public List<User> getAllUser(){
        return  userList;
    }

    public List<User> searchUserById(int id) {
        List<User> userList1=null;
        userList1=new ArrayList<>();

        for(User u:userList){
            if(u.getUserId()==id){
             userList1.add(u);
            }
        }
        return userList1;
    }


    }
//CRUD  c- create, r- retrieve, u- update, d - delete
/*
 DAO  -- data access object


 */