package org.com.onlinetest.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.com.onlinetest.dao.TestDao;
import org.com.onlinetest.exception.RecordNotFoundException;
import org.com.onlinetest.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private TestDao testdao;
	
	//private Student student;

//add Test	
	public Test addTest(Test test)
	   {
		  return testdao.save(test);
		   //return "Test Added Successfully...";
		   
	   }
	 
	 
//Update Test	
	 public String updateTest( BigInteger testId,  Test testdetails)
	    		throws RecordNotFoundException  {
	    	Test test = testdao.findById(testId).
	    	orElseThrow(() -> new RecordNotFoundException("Test not found for the give id" +testId));
	    	test.setTestDuration(testdetails.getTestDuration());
	    	test.setTestQuestions(testdetails.getTestQuestions());
	    	test.setTestTitle(testdetails.getTestTitle());
	    	test.setTestTotalMarks(testdetails.getTestTotalMarks());
	    	testdao.save(test);
	    	return "Test Updated Successfully...";
	    }
	 
//Delete test	  
	 public String deleteTest(BigInteger testId) throws RecordNotFoundException
	    {
	    	 testdao.findById(testId).
	    	 orElseThrow(() -> new RecordNotFoundException("Test not found for the given id" +testId));
	    	testdao.deleteById(testId);
	    	return "Test Deleted Successfully...";
	    }
	 
//get All Test
	 public List<Test> getAllTest(BigInteger testId){
	    	
		    System.out.println("All Tests are:");
	    	return testdao.findAll();
	    	
	    }

// get Test By Id
	 public ResponseEntity<Test> getTestById( BigInteger testId) throws RecordNotFoundException {
	    	Test test=testdao.findById(testId).
	   	 orElseThrow(() -> new RecordNotFoundException("Test not found for the given id" +testId));
	    	return ResponseEntity.ok().body(test);
	    }
	 
//assignTest
	/* public String assignTest(Long studentId, BigInteger testId) throws RecordNotFoundException
	 {
		 Test test=testdao.findById(testId).
    	 orElseThrow(() -> new RecordNotFoundException("Test not found for the given id" +testId));
    	 
		 student.get();
		 
		 return "Test Assigned Successfully...";
	 }*/
	 
	 
	 //total test
	
	 public BigDecimal calculateTotalMarks(BigInteger testId) throws RecordNotFoundException{
		 testdao.findById(testId).
    	 orElseThrow(() -> new RecordNotFoundException("Test not found for the given id" +testId));
    	QuestionService service=new QuestionService();
    	Test test= new Test();
    	
    	test.setTestMarksScored(BigDecimal.valueOf(service.calculateQuestionMarks(testId)));
   
           return test.getTestMarksScored();
    
	 }

}
