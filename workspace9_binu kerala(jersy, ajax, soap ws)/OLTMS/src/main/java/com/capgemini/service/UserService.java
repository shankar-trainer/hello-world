package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.capgemini.dao.TestDao;
import com.capgemini.dao.UserDao;
import com.capgemini.entity.Test;
import com.capgemini.entity.User;
import com.capgemini.exception.EntityAlreadyExists;
import com.capgemini.exception.EntityNotFoundException;

@Service
public class UserService implements UserServiceI {

	@Autowired
	UserDao dao;
	@Autowired
	TestDao tdao;

	@Override
	public String addUser(User user) {
		dao.save(user);
		return "User Created!!";
	}

	@Override
	public String deleteUser(String email) {
		long userId = dao.getIdByEmail(email);
		Optional<User> findById = dao.findById(userId);
		if (findById.isPresent()) {
			dao.deleteById(userId);
			return "User Removed";
		} else {
			throw new EntityNotFoundException("User does not exist");
		}

	}

	@Override
	public String updateUser(String email, User userDetails) {
		long userId = dao.getIdByEmail(email);
		Optional<User> findById = dao.findById(userId);
		if (findById.isPresent()) {
			User usr = findById.get();
			usr.setUserName(userDetails.getUserName());
			usr.setEmail(userDetails.getEmail());
			usr.setUserPassword(userDetails.getUserPassword());
			dao.save(usr);
			return "User Updated";
		} else {
			return "User does not exist";
		}
	}

	@Override
	public List<User> viewAll() {

		return dao.findAll();
	}

	@Override
	public Optional<User> findById(long userId) {
		Optional<User> findById = dao.findById(userId);
		if (findById.isPresent()) {
			return findById;
		} else {
			throw new EntityNotFoundException("User of user id" + userId + "does not exist");
		}
	}

	@Override
	public String assignTest(String email, int testId) {
		long userId = dao.getIdByEmail(email);
		Optional<User> findById = dao.findById(userId);
		Optional<Test> test = tdao.findById(testId);
		if (findById.isPresent() && test.isPresent()) {
			User usr = findById.get();
			usr.setTestId(testId);
			dao.save(usr);
			return "Test Assigned to user";
		}
		return "User or Test does not exist";
	}
  
	@Override
	public User findUserByEmail(String email) {
		long userId=dao.getIdByEmail(email);
		Optional<User> findById=dao.findById(userId);
		if(findById.isPresent()) {
			return findById.get();
		}
		else {
			throw new EntityNotFoundException("User not found");
		}

	}
}
