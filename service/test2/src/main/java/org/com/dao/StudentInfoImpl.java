package org.com.dao;

import org.com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("st")
//@Repository("st1")
public class StudentInfoImpl implements  StudentInfo{
	
	@Autowired
	Student st1;
	
	@Override
	public void message() {
		System.err.println("roll is " + st1.getRoll() + "\nName is " + st1.getName());
	}
}
