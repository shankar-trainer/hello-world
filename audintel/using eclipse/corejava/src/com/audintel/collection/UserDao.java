package com.audintel.collection;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
//dao data access object 
	private List<User> userList;

	public UserDao() {
		userList = new ArrayList<>();
	}

	public List<User> getAllUser() {
		return userList;
	}

	public User addUser(User user) {
		userList.add(user);
		return user;
	}

	public boolean searchUser(User user) {
		if (userList.contains(user)) {
			return true;
		}
		return false;
	}

	public boolean removeUser(User user) {
		if (userList.contains(user)) {
			return userList.remove(user);
		}
		return false;
	}

}
