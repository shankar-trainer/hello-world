package com.spring.onetomany.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import org.springframework.web.client.RestTemplate;

import com.spring.onetomany.model.Student;
import com.spring.onetomany.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	final static Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/findall")
	@CrossOrigin(origins = "*")
	public List<Student> getAllStudent() {
		logger.info("finding all data");
		logger.debug("HELLO {}", "jkkhg");
		// throw new ProductNotFoundException();
		return studentService.getAllStudent();
	}

	@RequestMapping(value = "/resttemplate")
	public ResponseEntity<String> getProductList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity =  new  HttpEntity<String>(headers);
		return restTemplate.exchange("http://localhost:8090/student/findall", HttpMethod.GET,entity,String.class);
	}

	@GetMapping("findbyid/{id}")
	@CrossOrigin(origins = "*")
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/save")
	@CrossOrigin(origins = "*")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("In save student "+student);
		studentService.saveStudent(student);
		return student;
	}

	@PutMapping("/editbyid/{id}")
	@CrossOrigin(origins = "*")
	public String editStudent(@PathVariable("id") int id, @RequestBody Student student) {
		studentService.editStudent(student, id);
		return "Student Updated Successfully";
	}

	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "*")
	public void deleteById(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
	}
}
