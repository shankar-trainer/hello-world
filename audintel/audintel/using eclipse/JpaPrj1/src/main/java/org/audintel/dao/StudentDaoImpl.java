package org.audintel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.audintel.model.Student;

public class StudentDaoImpl implements StudentDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tr;
     Query query;
	
	public StudentDaoImpl() {
	  emf= Persistence.createEntityManagerFactory("test1");
	  em=emf.createEntityManager();
	}
	
	@Override
	public List<Student> getAllStudent() {
		query=null;
		//em.createQue
		return null;
	}

	@Override
	public Student searchStudent(int roll) {
		return null;
	}

	@Override
	public Student removeStudent(int roll) {
		return null;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
