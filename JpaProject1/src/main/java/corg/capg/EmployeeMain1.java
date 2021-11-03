package corg.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import corg.capg.model.Employee;

public class EmployeeMain1 {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();
		
		//Query createQuery = manager.createQuery("select e from Employee e");
		TypedQuery<Employee> qr = manager.createQuery("select e from Employee e",Employee.class);
		
		System.out.println("all record");
		qr.getResultList().stream().forEach(a->System.out.println(a.getId()+"  "+a.getName()+"  "+a.getSalary()));
	
		TypedQuery<Employee> qr1 = manager.createQuery("select e from Employee e where e.id=8885",Employee.class);
	
		Employee find = qr1.getSingleResult();
				if(find!=null)
		System.out.println(
				find.getId() + "   " + find.getName() + "  " + find.getSalary() + "  " + find.getLocation());
				else
					System.out.println("Record not present");
		

	}
}
