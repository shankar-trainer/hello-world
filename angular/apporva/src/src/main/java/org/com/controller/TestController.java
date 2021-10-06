package org.com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.com.dao.TestRepositories;
import org.com.error.RecordNotFoundException;
import org.com.model.Test;
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
@RequestMapping("/test")

public class TestController {
	@Autowired
	TestRepositories dao;
	
	@RequestMapping("/allTests")
	public List<Test> getAllTests(){
		return dao.findAll();
		}
	
	@RequestMapping("/searchTest/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findTest(@PathVariable("id") Integer tid) {
		Optional<Test> findById=dao.findById(tid);
		try {
			if(findById.isPresent()) {
				Test test=findById.get();
				return new ResponseEntity<Test>(test,HttpStatus.OK);
			}
			else
				throw new RecordNotFoundException("Test not found");
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
//	@PostMapping("/addTest")
//	@ExceptionHandler(RecordNotFoundException.class)
//		public ResponseEntity<Test> saveTest(@RequestBody Test test) {
//		Optional<Test> findById=dao.findById(test.getTestId());
//		try{
//			if(!findById.isPresent()) {
//				dao.save(test);
//				return new ResponseEntity<Test>(test, HttpStatus.OK);
//			}
//			else
//				throw new RecordNotFoundException("Test already present...");
//		}
//		catch(RecordNotFoundException e){
//			return new ResponseEntity<Test>(test, HttpStatus.NOT_FOUND);
//		}
//	}
	
	@PostMapping("/addTest")
    public Test saveTest(@Valid @RequestBody Test test) {
            return  dao.save(test);
    }
	
	@DeleteMapping("/deleteTest/{id}")
	public String removeTest(@PathVariable("id") Integer tid) {
		Optional<Test> findById=dao.findById(tid);
		if(findById.isPresent()) {
			dao.deleteById(tid);
			return "Test removed";
		}
		return "Test not present";
	}
	
	@PutMapping("/updateTest")
	public String updateTest(@RequestBody Test test) {
		Optional<Test> findById=dao.findById(test.getTestId());
		if(findById.isPresent()) {
			dao.save(test);
			return "Test updated";
		}
		return "Test not present";
	}

}
