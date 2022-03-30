package com.capg.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capg.bean.Employee;

public class EmployeeMainJPQL {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sample");
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction transaction = em.getTransaction();
	
//	Query createQuery = em.createQuery("from  Employee");
	//TypedQuery is added in jpa2 
	TypedQuery<Employee> createQuery = em.createQuery("from  Employee",Employee.class);
	List<Employee> resultList = createQuery.getResultList();
	
	resultList.forEach(System.out::println);
	
	System.out.println("==================id and name only =======\n");

	 List<Employee> resultList2 = em.createQuery("select  e from Employee e where e.id>=10003").getResultList();
	    
	 for(Employee o:resultList2) {
		 
		 System.out.println(o.getId()+"\t"+o.getName()+"\t"+o.getLocation()+"\t"+o.getSalary());
	 }
	 
	  Object singleResult = em.createQuery("select  count(e.id) from Employee e where e.id>=10003").getSingleResult();
	 System.out.println("count is "+singleResult);
	 
	         										//using property reference
	 List<Object[]> list = em.createQuery("select  e.id,e.name,e.salary from Employee e where e.id>=10003").getResultList();
	 
	 for(Object[] o:list) {
		System.out.println(o[0]+"\t"+o[1]+"\t"+o[2]); 
	 } 
		 
		
	 
}
}
