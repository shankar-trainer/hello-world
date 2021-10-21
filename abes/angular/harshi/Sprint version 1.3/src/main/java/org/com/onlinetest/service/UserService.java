package org.com.onlinetest.service;
/*
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.com.onlinetest.dao.TestDao;
import org.com.onlinetest.dao.UserDao;
import org.com.onlinetest.exception.RecordNotFoundException;
import org.com.onlinetest.model.Test;
import org.com.onlinetest.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
	@Autowired
	
	UserDao dao;
	TestService service;
	@Autowired
	TestDao dao1;
	
	//add User
	public Users addUser(@RequestBody Users user) {
		return dao.save(user);
	
	}
	
	//show User
	public List<Users> getAllUser() {
		return dao.findAll();
	}
	/*
	//update User
	public ResponseEntity<Users> updateUser(@Valid @RequestBody Users user) {
		Optional<Users> findById = dao.findById(user.getUserId());
		try {
			if(findById.isPresent()) {
				dao.save(user);
				return new ResponseEntity<Users>(user,HttpStatus.OK);
			}
			else {
				throw new RecordNotFoundException("user profile not found");
			
			}
			}
		catch(RecordNotFoundException e) {
				return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
			}
		}
	
	
	//get result
	
	public int getResult(Test test) {
		int marks=1;
		System.out.println("You got ");
		return marks;
	}
		
	
	
	//login
	public boolean validloginId(Long loginId) {
		Optional<Users> findById=dao.findById(loginId);
		if(findById.isPresent()) {
			return true;
		}
		else return false;
	}

}
*/