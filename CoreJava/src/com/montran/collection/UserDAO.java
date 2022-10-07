package com.montran.collection;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

	Map<Integer, User> userMap;

	public UserDAO() {
		userMap = new HashMap<Integer, User>();
	}

	public boolean addUser(User user) {
		if (userMap.containsKey(user.getUserId()))
			return false;
		else {
			userMap.put(user.getUserId(), user);
			return true;
		}
	}

	public Map<Integer, User> getAllUsers() {
		return userMap;
	}
//--------------------
	public User removeUser(User user) {
		if (userMap.containsKey(user.getUserId()))
			return userMap.remove(user.getUserId());
		return null;
	}

	public boolean searchUser(User user) {
		return userMap.containsKey(user.getUserId());
	}
}
