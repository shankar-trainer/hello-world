package com.coforge.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coforge.model.User;

import lombok.Data;

@Service
@Data
public class UserService {
                                                      
	//@Autowired
	//@Qualifier("suser")
	//@Qualifier("nuser")
	@Resource(name="suser")
	
	User user;
}
//@Resource(name="suser")= @Autowired+@Qualifier("suser")