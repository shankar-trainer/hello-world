package com.abc.dao;

import java.util.HashSet;
import java.util.Set;

import com.abc.bean.User;

public class UserDao {

	private Set<User> set1;

	public UserDao() {
		set1 = new HashSet<User>();
	}

	public boolean addUser(User user) {
		if (set1.contains(user))
			return false;
		else {
			set1.add(user);
			return true;
		}
	}

	public boolean removeUser(User user) {
		if (!set1.contains(user))
			return false;
		else {
			set1.remove(user);
			return true;
		}
	}

	public User searchUser(User user) {
		if (set1.contains(user))
			return user;
		else {
			return null;
		}

	}

	public Set<User> getAllUser() {
		return set1;
	}

}
