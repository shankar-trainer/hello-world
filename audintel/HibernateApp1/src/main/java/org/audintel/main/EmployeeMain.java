package org.audintel.main;

import java.util.List;
import java.util.Scanner;

import org.audintel.model.Employee;
import org.audintel.util.MySessionfactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeMain {

	public static void main(String[] args) {
//		Configuration configuration = new Configuration().configure();

	//	SessionFactory factory = configuration.buildSessionFactory();
			SessionFactory factory =  MySessionfactory.mySessionFactory();
			Session session = factory.openSession();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id name and salary ");

		Employee emp = new Employee();
		emp.setEmpId(sc.nextInt());
		sc.nextLine();
		emp.setEmpName(sc.nextLine());
		emp.setEmpsalary(sc.nextFloat());

		Transaction tr = session.getTransaction();
		tr.begin();

		session.save(emp);
		tr.commit();

		System.out.println("record added");
		System.out.println("all records ");
		Query createQuery = session.createQuery("from Employee");
		List<Employee> resultList = createQuery.getResultList();

		for (Employee emp1 : resultList)
			System.out.println(emp1.getEmpId() + "\t" + emp1.getEmpName() + "\t" + emp1.getEmpsalary());

		System.out.println("Enter id to delete record ");

		int id = sc.nextInt();
		Employee emp3 = session.find(Employee.class, id);
		if (emp3 == null)
			System.out.println("employee not found  ");
		else {
			tr.begin();
			session.delete(emp3);
			tr.commit();
			System.out.println("employee deleted ");
		}
		System.out.println("Enter id to find record ");
		Employee emp1 = session.find(Employee.class, sc.nextInt());
		if (emp1 == null)
			System.out.println("employee not found  ");
		else {
			System.out.println("employee found ");
			System.out.println(emp1.getEmpId() + "\t" + emp1.getEmpName() + "\t" + emp1.getEmpsalary());
		}

	}
}
