package cts.com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import cts.com.dao.StudentRepository;
import cts.com.model.Student;
//import cts.com.service.StudentService;
import cts.com.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(value = "http://localhost:4200")
public class StudentController {

	@Autowired
	StudentService service;

	// @RequestMapping("/allstudent")
	@GetMapping("/allstudent")
	public List<Student> showAllStudent() {
		return service.getAllStudent();
	}

	@GetMapping("/searchStudent/{roll_1}")
	public ResponseEntity<?> findStudent(@PathVariable("roll_1") int roll) {
		if (service.searchStudent(roll) != null) {
			Student s = service.searchStudent(roll);
			return new ResponseEntity<Student>(s, HttpStatus.OK);
		} else
			return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteStudent/{roll_1}")
	public ResponseEntity<?> removeStudent(@PathVariable("roll_1") int roll) {
		if (service.searchStudent(roll) != null) {
			Student s2 = service.searchStudent(roll);
			service.deleteStudent(roll);
			return new ResponseEntity(s2, HttpStatus.OK);
		} else
			return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(@Valid @RequestBody Student s) {
		if (service.searchStudent1(s.getRoll()) == null) {
			service.addStudent(s);
			return new ResponseEntity(s, HttpStatus.OK);
		} else {
			return new ResponseEntity(s, HttpStatus.NOT_FOUND);
		}
	}

}
