package org.com.controller;

import java.util.List;

import javax.validation.Valid;

import org.com.dto.Customer;
import org.com.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cst1")
public class CustomerController2 {

	@GetMapping("/hello")
	public String hello(){
		System.out.println("hello called ");
		return "hello world";
		
	}
	
	
}
