package com.capg.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sample");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		Employee emp1=new Employee();
/*		
		emp1.setId(10001);
		emp1.setName("hari harana kumar");
		emp1.setSalary(35000);
*/
		System.out.println("Enter id, name, salary and location");
		emp1.setId(sc.nextInt());
		sc.nextLine();
		emp1.setName(sc.nextLine());
		emp1.setSalary(sc.nextFloat());
		emp1.setLocation(sc.next());
		
		transaction.begin();
		em.persist(emp1);
		transaction.commit();
		System.out.println("Record added ");
		                                 //jpql -- java persistence query language
	    Query qr = em.createQuery("from Employee");	
		
	    List<Employee> resultList = qr.getResultList();
	    
	    for(Employee e:resultList)
	    	System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getLocation());
	    System.out.println("Enter id to find employee");
	    int id1=sc.nextInt();
	    
	    Employee find = em.find(Employee.class, id1);
	    
	    if(find!=null) {
	    	System.out.println("Employee found with id "+id1);
	       System.out.println(find.getId()+"\t"+find.getName()+"\t"+find.getSalary()+"\t"+find.getLocation());	
	    }
	    else
	    System.out.println("Employee not  found with id "+id1);
	    
	    
	    System.out.println("Enter id to delete employee");
	    id1=sc.nextInt();
	    
	    find = em.find(Employee.class, id1);
	    
	    if(find!=null) {
	    	System.out.println("Employee found with id "+id1);
	    	transaction.begin();
	    	em.remove(find);
	    	transaction.commit();
	    	System.out.println("Employee  with id "+id1+" is deleted ");
	    }
	    else
	    System.out.println("Employee not  found with id "+id1);
	    
	    
		em.close();
		emf.close();
		sc.close();
	}
}
