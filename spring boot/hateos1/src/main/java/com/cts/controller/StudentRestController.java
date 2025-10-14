package com.cts.controller;

import com.cts.error.StudentNotFoundException;
import com.cts.error.StudentWithIdAlreadyExistsException;
import com.cts.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/api/v1/students")
public class StudentRestController {

	private final Map<Integer, Student> students;

	public StudentRestController() {
		students = new HashMap<>();
		students.put(1, new Student(1, "Murari Walake", 25));
		students.put(2, new Student(2, "John Doe", 30));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) {
		Student student = students.get(id);

		if (student == null) {
			throw new StudentNotFoundException("Student with id " + id + " not found");
		}

		return ResponseEntity.ok(student);
	}

	@GetMapping()
	public ResponseEntity<Map<Integer, Student>> getStudents() {
		return ResponseEntity.ok(students);
	}

	@PostMapping()
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		if (students.containsKey(student.getId())) {
			throw new StudentWithIdAlreadyExistsException("Student with id " + student.getId() + " already exists");
		}
		students.put(student.getId(), student);
		return ResponseEntity.ok(student);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
		if (!students.containsKey(id)) {
			throw new StudentNotFoundException("Student with id " + id + " not found");
		}
		student.setId(id);
		students.put(id, student);
		return ResponseEntity.ok(student);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
		if (!students.containsKey(id)) {
			throw new StudentNotFoundException("Student with id " + id + " not found");
		}
		students.remove(id);
		return ResponseEntity.ok().build();
	}
}