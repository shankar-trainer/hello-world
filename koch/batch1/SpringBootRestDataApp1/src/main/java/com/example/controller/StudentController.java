package com.example.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.AddressRepository;
import com.example.dao.EmployeeRepository;
import com.example.dao.StudentRepository;
import com.example.model.Address;
import com.example.model.Course;
import com.example.model.Employee;
import com.example.model.Student;

@RestController
@RequestMapping("/")
public class StudentController {

	@Autowired
	private StudentRepository repository;

	@Autowired
	private AddressRepository addr_repository;

	@GetMapping("/student")
	public List<Student> getStudents() {
		return repository.findAll();
	}

	@GetMapping("/student/{roll}")
	public Student getStudentByRoll(@PathVariable int roll) {
		return repository.findById(roll).get();
	}

	@GetMapping("/student/{roll}/{id}")
	public Address getAddressByRollandId(@PathVariable int roll, @PathVariable int id) {
//		Student student = repository.findById(roll).get();
		Address address = addr_repository.findById(id).get();
		return repository.findById(roll).get().getAddress();
	}

	@GetMapping("/student/course/{roll}/{id}")
	public Course getCourseByRollandCourseId(@PathVariable int roll, @PathVariable int id) {
		Set<Course> courseSet = repository.findById(roll).get().getCourseSet();

		return courseSet.stream().filter(a -> a.getCourseId() == id).findFirst().get();
	}

	@DeleteMapping("/student/{id}")
	public Student deleteStudent(@PathVariable("id") int id) {
		Student student = repository.findById(id).get();
		repository.deleteById(id);
		return student;
	}

	@PostMapping("/student")
	public Student addStundent(@RequestBody Student student) {
		// addr_repository.save(student.getAddress());
		return repository.save(student);

	}
}
