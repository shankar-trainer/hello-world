package com.flight.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.flight.entities.User;

public interface UserDao {
	public User addUser(User u);

	public User updateUser(User u);

	public Optional<User> viewUserById(BigInteger id);

	public List<User> displayAllUsers();

	public User validateUser(User u);

	public boolean deleteUser(User u);

}
