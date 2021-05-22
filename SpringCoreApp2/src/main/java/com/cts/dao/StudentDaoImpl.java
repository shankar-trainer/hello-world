package com.cts.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.cts.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	List<Student> studList;

	public StudentDaoImpl() {
		studList = new ArrayList<Student>();
	}

	@Override
	public Student addStudent(Student student) {
		studList.add(student);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		return studList;
	}

}
