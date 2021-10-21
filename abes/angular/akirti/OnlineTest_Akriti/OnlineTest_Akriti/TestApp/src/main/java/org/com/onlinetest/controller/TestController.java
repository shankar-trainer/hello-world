package org.com.onlinetest.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import org.com.onlinetest.dao.TestDao;
import org.com.onlinetest.exception.RecordNotFoundException;
import org.com.onlinetest.model.Question;
import org.com.onlinetest.model.Test;
import org.com.onlinetest.service.QuestionService;
import org.com.onlinetest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testservice;
	@Autowired
	private QuestionService questionservice;
	
	@Autowired
	private TestDao testdao;

	// add new test
	@PostMapping("/addTest")
	public String addTest(@RequestBody Test test) {

		return testservice.addTest(test);

	}

	// update test
	@PutMapping("/updateTest/{id}")
	public String updateTest(@PathVariable(value = "id") BigInteger testId, @RequestBody Test testdetails)
			throws RecordNotFoundException {

		return testservice.updateTest(testId, testdetails);
	}

	// delete test
	@DeleteMapping("/deleteTest/{id}")
	public String deleteTest(@PathVariable(value = "id") BigInteger testId) throws RecordNotFoundException {

		return testservice.deleteTest(testId);
	}

	// get Test By Id
	@GetMapping("/findTestById/{id}")
	public ResponseEntity<Test> getTestById(@PathVariable(value = "id") BigInteger testId)
			throws RecordNotFoundException {

		return testservice.getTestById(testId);
	}

	// Get All Test
	@GetMapping("/AllTest")
	public List<Test> getAllTest(BigInteger testId) {

		return testservice.getAllTest(testId);

	}

	// add question
	@PostMapping("/addQuestion/{testId}")
	public Question addQuestion(@PathVariable(value = "testId") BigInteger testId, @RequestBody Question question) {
		return questionservice.addQuestion(testId, question);

	}

	// update question
	@PutMapping("/updateQuestion/{id}")
	public String updateQuestion(@PathVariable(value = "id") BigInteger testId,@RequestBody Question questionDetails)
			throws RecordNotFoundException {
		return questionservice.updateQuestion(testId,questionDetails);
	}

	// delete question
	@DeleteMapping("/deleteQuestion/{id}")
	public String deleteQuestion(@PathVariable(value = "id") BigInteger questionId) throws RecordNotFoundException {

		return questionservice.deleteQuestion(questionId);
	}

	// show question
	@GetMapping("/AllQuestions")
	public List<Question> getQuestions() {

		return questionservice.viewAll();

	}

	// calculate total marks
	@GetMapping("/getMarks")
	public BigDecimal calculateTotalMarks(/* @PathVariable(value="id") */BigInteger testId)
			throws RecordNotFoundException {
		return testservice.calculateTotalMarks(testId);
	}
	
	//assign test to student
	@GetMapping("/assignTest/{id}")
	public String assignTest(@PathVariable(value="id")BigInteger testId) throws RecordNotFoundException {
		
		Test test =testdao.findById(testId).orElseThrow(()->new RecordNotFoundException("Test not found for given id" +testId));
		BigInteger studentId = testdao.findById(testId).get().getStudent().getStudentId();
		return testId+" "+studentId;
	}

}
