package org.com.controller;

import java.util.List;
import java.util.Optional;

import org.com.dao.QuestionDao;
import org.com.dao.TestDao;
import org.com.error.RecordNotFoundException;
import org.com.model.Question;
import org.com.model.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
@CrossOrigin("http://localhost:4200")

public class QuestionController {
	//User user;
	
	@Autowired
	QuestionDao dao;
	
//	TestController tc;
	
//////////////////////////////////////////////////////////////////////////////////////////////	
	
	@PostMapping("/allQuestions")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Question> saveQuestion(@RequestBody Question ques)
	{
		
	
	try {
		//if(user.isAdmin()) {
	
	//	if(tc.findTest(id)!=null) {
		Optional<Question> findById= dao.findById(ques.getQuestionId());
		
		//try {
		if(!findById.isPresent())
		{
			dao.save(ques);
		System.out.println("Qusetion added...");
		return new ResponseEntity<Question>(ques,HttpStatus.OK);
		}		
		else
			throw new RecordNotFoundException("Question already present");
		//else
			//throw new RecordNotFoundException("You are not admin");
		
		//}
	
		//}
	//else {
	//	throw new RecordNotFoundException("test id not present");
		
	//}

		
	}catch(RecordNotFoundException e)
	{
		return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	}
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////
		
	@PutMapping("/allQuestions")
	//@ExceptionHandler(RecordNotFoundException.class)

		public ResponseEntity<?> updateQuestion(@RequestBody Question ques, @PathVariable("id") int tid)
		{
			try {
			//if(user.isAdmin()) {
			Optional<Question> findById=dao.findById(tid);
			
			if(findById.isPresent())
			{
				dao.save(ques);
				System.out.println("Question updated...");
				return new ResponseEntity<Question>(ques,HttpStatus.OK);	
			}
			else
				throw new RecordNotFoundException("Question not present...");
		
			}
			catch(RecordNotFoundException e)
			{
				return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
						
			}
			}

	
//////////////////////////////////////////////////////////////////////////////////////////////
	
	@DeleteMapping("/allQuestions/{id}")
	//@ExceptionHandler(RecordNotFoundException.class)
		public ResponseEntity<?> removeQuestion(@RequestBody Question ques, @PathVariable("id") int tid)
		{
			try {
	//		if(user.isAdmin()) {
			Optional<Question> findById=dao.findById(tid);
			if(findById.isPresent())
			{
				dao.deleteById(tid);
				System.out.println("Question removed");
				return new ResponseEntity<Question>(ques,HttpStatus.OK);
			}
			else
				throw new RecordNotFoundException("Question not present");
			}
			
			
	catch(RecordNotFoundException e)
	{
		return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////		
	@GetMapping("/allQuestions")
	public List<Question> showAllQuestion()
	{
		return dao.findAll();	
	}
	
	
	
	
	
	@RequestMapping("/allQuestions/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findTest(@PathVariable("id")int pid){
		
		Optional<Question> findById=dao.findById(pid);
		try {
		if(findById.isPresent()) {
			Question ques=findById.get();
			return new ResponseEntity<Question>(ques,HttpStatus.OK);
		}
		
		else
			throw new RecordNotFoundException("record not found");
		}catch( RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
