package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.entity.User;

public interface UserServiceI {
	public String addUser(User User);
	public String deleteUser(String email);
	public String updateUser(String email,User userDetails);
	public List<User> viewAll();
	public Optional<User> findById(long userId);
	public String assignTest(String email, int testId);
	public User findUserByEmail(String email);
}
