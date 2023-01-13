package com.tvscredit.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tvscredit.dao.AccountDao;
import com.tvscredit.dao.UserDao;
import com.tvscredit.model.Account;
import com.tvscredit.model.User;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;
	
	@Autowired
	AccountDao accountDao;

	/*
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		//accountDao.save(user.getAccount());
		userDao.save(user);
		return user;
	}
	*/
	
	@PostMapping("/addAccount")
	public Account addUser(@RequestBody User  user) {
		userDao.save(user);
		return accountDao.save(user.getAccount());
	}

	@GetMapping("/getAllUser")
	public List<User> allCustomer() {
		return userDao.findAll();
	}

}
