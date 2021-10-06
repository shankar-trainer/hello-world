package com.capegemini.java8;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

	static List<User> list_user;
	
	public UserDao() {
	list_user=new ArrayList<>();
	}
		
	public void addUser(User user) {
		list_user.add(user);
	}
	
	public List<User> getAllUser(){
		return list_user;
	}
	
	public static List<User> getAllUser1(){
		return list_user;
	}
	
}
