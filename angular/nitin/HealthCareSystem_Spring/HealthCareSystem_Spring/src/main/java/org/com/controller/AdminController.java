package org.com.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;
import javax.persistence.GeneratedValue;
import javax.validation.Valid;

import org.com.dao.AdminRepository;
import org.com.exception.RecordNotFoundException;
import org.com.model.Admin;
import org.com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin(value = "http://localhost:4200", maxAge = 80)
public class AdminController {

	@Autowired
	AdminRepository dao;


	/*
	 * @PostMapping("/getAdmin")
	 * 
	 * @ExceptionHandler(RecordNotFoundException.class) public ResponseEntity<Admin>
	 * addAdmin(@RequestBody Admin admin) { Optional<Admin> findById =
	 * dao.findById(admin.getId()); try { if (!findById.isPresent()) {
	 * dao.save(admin); return new ResponseEntity<Admin>(admin,HttpStatus.OK); }else
	 * throw new RecordNotFoundException("Record Already present!!"); }
	 * catch(RecordNotFoundException e) { return new
	 * ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND); } }
	 */
	//Add ADMIN
	@PostMapping("/getAdmin")
	public Admin saveAdmin(@Valid @RequestBody Admin admin) {
		return dao.save(admin);
	}

	/*
	 * @RequestMapping("/getAdmin/login") public String login(Integer id, String
	 * password) { Optional<Admin> findById = dao.findById(id); if
	 * (findById.isPresent()) { Admin admin = findById.get(); if
	 * (admin.getPassword() == password) return "loginSuccess"; } return
	 * "loginNotSuccess"; }
	 */
	// SHOW ALL ADMINS
	@GetMapping("/getAdmin")
	public List<Admin> showAllAdmin() {
		return dao.findAll();
	}
	//SEARCH ADMIN
	@RequestMapping("/getAdmin/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findAdmin(@PathVariable("id") int uid) {
		Optional<Admin> findById = dao.findById(uid);
		try {
			if (findById.isPresent()) {
				Admin admin = findById.get();
				return new ResponseEntity<Admin>(admin, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("Record not found!!");
		} catch (RecordNotFoundException e) {

			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	
	//DELETE ADMIN
	@DeleteMapping("/getAdmin/{id}")
	public String removeAdmin(@PathVariable("id") int uid) {
		Optional<Admin> findById = dao.findById(uid);
		if (findById.isPresent()) {
			dao.deleteById(uid);
			return "Admin " + dao.findById(uid) + " Removed!!!";
		}
		return "Admin Not Found!!!";
	}

	
	//COUNT ADMINS
	@GetMapping("/getCount")
	public String getTotalCount() {
		return "Total no of records are: " + dao.count();
	}

	
	//UPDATE ADMIN
	@PutMapping("/getAdmin/{id}")
	public String updateAdmin(@RequestBody Admin admin) {
		Optional<Admin> findById = dao.findById(admin.getId());
		if (findById.isPresent()) {
			dao.save(admin);
			return "Admin Detail Updated!!!";
		}
		return "Admin Not Found!!!";
	}

}
