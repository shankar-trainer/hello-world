package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.User;

public class UserDao {

	List<User> userList;
	
	public UserDao() {
		userList=new ArrayList<User>();
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	public List<User> getAllUser() {
	 return 	userList;
	}
	
	public boolean searchUser(User user) {
		return 	userList.contains(user);
	}
	
	
}
