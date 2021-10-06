package org.com.controller;


import java.util.List;
import java.util.Optional;

import org.com.dao.AdminDao;
import org.com.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminDao dao;
	
	
	
	
	@PostMapping("/addAdmin")
	public String saveProduct1(@RequestBody Admin admin) {
		System.out.println(admin);
		Optional<Admin> findById=dao.findById(admin.getAdminID());
		System.out.println(findById);
		if(!findById.isPresent()) {
			dao.save(admin);
			return "admin added";
		}
		return "admin id already present";
	}
	
	
	@GetMapping("/getDetails")
	public List<Admin> getAllProduct() {
		
		return dao.findAll();
		
	}
	/*
	@PutMapping("/getProduct")
	public String updateProduct1(@RequestBody Product product) {
		Optional<Product> findById=dao.findById(product.getPrdId());
		if(findById.isPresent()) {
			
			dao.save(product);
			return "product updated";
		}
		else {
			System.out.println("id "+product.getPrdId()+" not present");
		return "product not updated";
		}
		
	}
	
	
	
	
	
	@RequestMapping("/getProduct/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findProduct1(@PathVariable("id")int pid){
		
		Optional<Product> findById=dao.findById(pid);
		try {
		if(findById.isPresent()) {
			Product product=findById.get();
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		
		else
			throw new RecordNotFoundException("record not found");
		}catch( RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		
		}
		
	}
	*/
	
}
