import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.lpu.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 
		Configuration configuration = new Configuration();
		configuration.configure();   //read hibernate.cfg.xml

		// SessionFactory is connection provider
		SessionFactory sf = configuration.buildSessionFactory();

		//Session is database connection
		Session session = sf.openSession();

		Transaction transaction = session.getTransaction();

		Employee employee = new Employee();
		
		System.out.println("Enter id, name,salary");
		
		employee.setId(10004);
		employee.setName("ram partap kumar");
		employee.setSalary(80000.00f);

		transaction.begin();
		session.save(employee);
		transaction.commit();

		System.out.println("Record added");
		                                 //HQL
		Query query = session.createQuery("from Employee");
		
		List<Employee> list = query.list();

		System.out.println("All Employee List");
		
		for (Employee employee2 : list) {
		  System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());	
		}
		
		System.out.println("enter id to search ");
		int id=sc.nextInt();
        Employee employee2 = session.get(Employee.class, id);		
        if(employee2==null)
        	System.out.println("emplyee not found with id "+id);
        else {
        	System.out.println("employee foudn  with id "+id);
          System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
        }
        }
}
