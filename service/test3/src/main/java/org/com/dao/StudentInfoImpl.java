package org.com.dao;


import org.com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("st")
//@Repository("st1")
public class StudentInfoImpl implements
   StudentInfo{
	
	@Autowired
	Student st;
	
	@Override
	public void message() {
		System.out.println("roll is " + st.getRoll() + "\nName is " + st.getName());
	}
}
