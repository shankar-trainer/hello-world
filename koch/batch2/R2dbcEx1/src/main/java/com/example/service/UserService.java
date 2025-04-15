package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;

import reactor.core.publisher.Flux;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public Flux<User>  getAllUser(){
		
	}
}
