package org.com.controller;

import java.util.List;
import java.util.Optional;

import org.com.OnlineWalletSystemApplication;
import org.com.error.RecordNotFoundException;
import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.com.service.WalletCreationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import org.com.error.RecordNotFoundException;


@RestController
@RequestMapping("/wallet")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin
public class WalletCreationController {

	@Autowired
	private WalletCreationService creationService;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(OnlineWalletSystemApplication.class);
	
	@PostMapping("/addUser")
	@ExceptionHandler(RecordNotFoundException.class)
	public WalletUser addUser(@RequestBody WalletUser walletUser) {
		WalletUser user = new WalletUser();
		
    try {
			  user=creationService.addUser(walletUser);
			
			if(user==null)
				throw new RecordNotFoundException("Record Not Found");
			
		
		} catch(Exception e) {
			
			LOGGER.info(e.getMessage(), HttpStatus.NOT_FOUND);
			
		}
		return user;
		
	}
	
	@DeleteMapping("/deleteUser/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> removeUserById(@PathVariable("id") int uid) {
		
		try {
			
			String msg = creationService.removeUserById(uid);
			
			if(msg.equals("user removed"))
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			else
				throw new RecordNotFoundException("Record Not Found");
		
		} catch(Exception e) {
			
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}

	@PutMapping("/updateUser")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> updateUser(@RequestBody WalletUser walletUser) {
		
     try {
			
			String msg = creationService.updateUser(walletUser);
			
			if(msg.equals("user updated"))
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			else
				throw new RecordNotFoundException("Record Not Found");
		
		} catch(Exception e) {
			
			return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping("/showUser/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public WalletUser showUserById(@PathVariable("id") int uid) {
		
		/*try {
			
			WalletUser user = creationService.showUserById(uid);
			
		if(user==null)
			throw new RecordNotFoundException("Record Not Found");
		else
			return new ResponseEntity<WalletUser>(user, HttpStatus.OK);
		}
		catch(Exception e) {
			
		     return  new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}*/
		
		return creationService.showUserById(uid);
	}
	@RequestMapping("/validLoginName/{loginName}")
	public boolean validLoginName(@PathVariable("loginName") String loginName) {
		
		return creationService.validLoginName(loginName);
	}
	
	@RequestMapping("/validLogin/{loginName}/{password}")
	public Integer validLoginName(@PathVariable("loginName") String loginName, @PathVariable("password") String password) {
		
		return creationService.validLogin(loginName, password);
	}
	
	@RequestMapping("/showBalance/{id}")
	public double showBalance(@PathVariable("id") int uid) {
		
		return creationService.showBalance(uid);
	}
	
	@RequestMapping("/showTransactions/{id}")
	public List<WalletTransaction> showTransactions(@PathVariable("id") int uid){
		return creationService.showTransactions(uid);
	}
	
	
	
}
