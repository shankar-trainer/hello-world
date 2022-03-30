package com.capg.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capg.bean.Employee;

public class EmployeeMainJPQL2 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sample");
		EntityManager em=emf.createEntityManager();
		
		
		TypedQuery<Employee> createQuery = em.createQuery("from  Employee e where e.id=10001",Employee.class);
		
		 Employee singleResult = createQuery.getSingleResult();
		 System.out.println(singleResult); 
		 System.out.println(singleResult.getId()+"\t"+singleResult.getName()+"\t"+singleResult.getSalary()); 
		
		 TypedQuery<Long> tq= em.createQuery("select  count(e.id) from Employee e where e.id>=10003",Long.class);
		 
		 Long o  = tq.getSingleResult();
		 System.out.println("total count "+o);
		 
		 //Named Parameterized query 
		 TypedQuery<Employee> parameterQuery = em.createQuery("from  Employee e where e.name=:pname",Employee.class);
		 
		 parameterQuery.setParameter("pname", "senthil");
		 
		 Employee e1=parameterQuery.getSingleResult();
		 System.out.println(e1);
//Position parameterized query 		 
		 TypedQuery<Employee> parameterQuery1 = em.createQuery("from  Employee e where e.name=?1 and e.salary=?2",Employee.class);
		 parameterQuery1.setParameter(1, "sita laxmi");
		 parameterQuery1.setParameter(2, 97000.0f);
		 
		 e1=parameterQuery.getSingleResult();
		 System.out.println(e1);
	}
}
