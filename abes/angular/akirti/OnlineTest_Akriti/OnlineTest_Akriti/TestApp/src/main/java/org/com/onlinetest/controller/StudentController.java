package org.com.onlinetest.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import org.com.onlinetest.dao.TestDao;
import org.com.onlinetest.exception.RecordNotFoundException;
import org.com.onlinetest.model.Question;
import org.com.onlinetest.model.Student;
import org.com.onlinetest.model.Test;
import org.com.onlinetest.service.QuestionService;
import org.com.onlinetest.service.StudentService;
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
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService stdService;
	
	@Autowired
	private TestService testService;
	

	// add new student
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student std) {

		return stdService.addStudent(std);

	}

	// update student
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> updateStudent( @RequestBody Student studentDetails)
			throws RecordNotFoundException {
                  //studentDetails.setStudentId(stdId);
		return stdService.updateStudent(studentDetails);
	}

	// delete student
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") BigInteger stdId) throws RecordNotFoundException {

		return stdService.deleteStudent(stdId);
	}

	// get student By Id
	@GetMapping("/findStudentById/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") BigInteger stdId)
			throws RecordNotFoundException {

		return stdService.getStudentById(stdId);
	}

	// Get All students
	@GetMapping("/AllStudents")
	public List<Student> getAllStudent(BigInteger stdId) {

		return stdService.getAllStudent(stdId);

	}
	//Get Result
	@PostMapping("/getResult")
	public BigDecimal getResult(@RequestBody Test test) {
		
		try {
			return testService.calculateTotalMarks(test.getTestId());
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
