package cts.com.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cts.com.dao.StudentRepository;
import cts.com.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository dao;

	public List<Student> getAllStudent() {
		return dao.findAll();
	}

	public Student searchStudent1(int roll) {
		Optional<Student> findByRoll = dao.findById(roll);

		if (findByRoll.isPresent())
			throw new RuntimeException("Record already  present");
		else {
			return null;
		}
	}
	
	
	public Student searchStudent(int roll) {
		Optional<Student> findByRoll = dao.findById(roll);

		if (findByRoll.isPresent())
			return findByRoll.get();
		else {
			throw new RuntimeException("Record not present");
		}
	}

	public boolean deleteStudent(int roll) {

		Optional<Student> findByRoll = dao.findById(roll);

		if (findByRoll.isPresent()) {
			Student s1 = findByRoll.get();
			dao.delete(s1);
			return true;
		} else
			throw new RuntimeException("student not present");
	}

	public boolean addStudent(Student s) {

		Optional<Student> findByRoll = dao.findById(s.getRoll());

		if (findByRoll.isPresent()) {
			throw new RuntimeException("student already  present");
		} else {
			dao.save(s);
			return true;
		}
	}

}
