package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ManagerException;
import com.example.model.Manager;
import com.example.service.ManagerService;

@RestController
@RequestMapping("/emp")
public class MangerController {

	@Autowired
private	ManagerService service;
	
	@PostMapping("/save")
	public ResponseEntity<Manager> saveManager(@RequestBody Manager m){
		try {
			return new ResponseEntity<Manager>(service.addManager(m),HttpStatus.OK);
		} catch (ManagerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Manager> updateManager(@RequestBody Manager m){
		try {
			return new ResponseEntity<Manager>(service.updateManager(m),HttpStatus.OK);
		} catch (ManagerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Manager>> showAllManager(){
		 try {
		return new ResponseEntity<List<Manager>>(service.getAllManager(),HttpStatus.OK);
		} catch (ManagerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Manager> findManager(@PathVariable("id") int id){
		try {
			return new ResponseEntity<Manager>(service.searchManager(id),HttpStatus.OK);
		} catch (ManagerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Manager> deleteManager(@PathVariable("id") int id){
		try {
			return new ResponseEntity<Manager>(service.removeManager(id),HttpStatus.OK);
		} catch (ManagerException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
}
