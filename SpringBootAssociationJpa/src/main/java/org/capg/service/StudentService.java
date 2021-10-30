package org.capg.service;

import java.util.List;
import org.capg.dao.AddressRepository;
import org.capg.dao.StudentRepository;
import org.capg.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentdao;
	@Autowired
	AddressRepository addressdao;
	
	
	public List<Student> getAllStudent(){
		 return  studentdao.findAll();
	}
	
    public void addStudent(Student s) {
     
    	addressdao.save(s.getAddr());
        studentdao.save(s); 
    }	
}
