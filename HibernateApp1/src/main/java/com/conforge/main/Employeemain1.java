package com.conforge.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conforge.model.onetoone_bidirectional.Department;
import com.conforge.model.onetoone_bidirectional.Employee;
import com.conforge.util.SessionFactoryUtil;

public class Employeemain1 {

	public static void main(String[] args) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		
		Set<Employee>  empset1=new HashSet<>();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.setName("ram kumar");
		emp1.setSalary(20000);
		
		emp2.setName("sham kumar");
		emp2.setSalary(50000);
		
		empset1.add(emp1);
		empset1.add(emp2);
		
		Department department=new Department();
		department.setName("software development");
		
		department.setEmployees(empset1);
		
		transaction.begin();
		
		//session.save(emp1);
		//session.save(emp2);
		
		session.save(department);
		
		transaction.commit();
	}
}
