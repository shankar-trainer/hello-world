package org.com.controller;

import java.util.List;

import org.com.error.RecordNotFoundException;
import org.com.model.WalletAdmin;
import org.com.model.WalletUser;
import org.com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addAdmin")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> addAdmin(@RequestBody WalletAdmin walletAdmin) {
		
    try {
			
			String msg = adminService.addAdmin(walletAdmin);
			
			if(msg.equals("admin added"))
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			else
				throw new RecordNotFoundException("Record Not Found");
		
		} catch(Exception e) {
			
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping("/updateAdmin")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> updateAdmin(@RequestBody WalletAdmin walletAdmin) {
		
     try {
			
			String msg = adminService.updateAdmin(walletAdmin);
			
			if(msg.equals("admin updated"))
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			else
				throw new RecordNotFoundException("Record Not Found");
		
		} catch(Exception e) {
			
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> removeAdminById(@PathVariable("id") int aid) {
		
		try {
			
			String msg = adminService.removeAdminById(aid);
			
			if(msg.equals("admin removed"))
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			else
				throw new RecordNotFoundException("Record Not Found");
		
		} catch(Exception e) {
			
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping("/showAdmin/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> showAdminById(@PathVariable("id") int aid) {
		
		try {
			
			WalletAdmin admin = adminService.showAdminById(aid);
			
		if(admin==null)
			throw new RecordNotFoundException("Record Not Found");
		else
			return new ResponseEntity<WalletAdmin>(admin, HttpStatus.OK);
		}
		catch(Exception e) {
			
		     return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/updateUser")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> updateUser(@RequestBody WalletUser walletUser) {
		
     try {
			
			String msg = adminService.updateUser(walletUser);
			
			if(msg.equals("user updated"))
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			else
				throw new RecordNotFoundException("Record Not Found");
		
		} catch(Exception e) {
			
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping("/showRegisteredUsers")
	public List<WalletUser> showRegisteredUsers(){
		return adminService.showRegisteredUsers();
	}
}

