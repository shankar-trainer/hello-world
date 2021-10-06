package com.capgemini.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.UserDao;
import com.capgemini.entity.User;

@Service
public class LoginService implements LoginServiceI {

	@Autowired
	UserDao userDao;
	
	@Override
	public String login(String email,String password){
		long id=userDao.getIdByEmail(email);
		Optional<User> userTest =  userDao.findById(id);
		if(userTest.isPresent()) {
			User user = userTest.get();
			if(user.getUserPassword().equals(password)) {
				if(user.getIsAdmin().equals("true")) return "The user is admin";
				else return "The user is Not Admin";
			}
			return "The Password is not Correct !!";
		}
		return "The User is Not Present !!" ;
	}
}
