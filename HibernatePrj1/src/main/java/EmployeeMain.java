
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
		
		Configuration configuration=new Configuration().configure();
		
		 SessionFactory factory=		 configuration.buildSessionFactory();
		
		 Session session=factory.openSession();
		 
		 Transaction tr = session.beginTransaction();
		 
		 Scanner sc=new Scanner(System.in);
		 
		 Employee employee=new Employee();
		 System.out.println("Enter id ");
		 employee.setId(sc.nextInt());
		 System.out.println("Enter name ");
		   sc.nextLine();
		 employee.setName(sc.nextLine());
		 System.out.println("Enter salary ");
		 employee.setSalary(sc.nextFloat());
		 
		  session.save(employee);
		 tr.commit();
		 
		 System.out.println("Record added");
		 //HQL Hibernate Query Language
	      Query createQuery = session.createQuery("from  Employee");
		    List<Employee> list = createQuery.list();
	          for (Employee employee2 : list) {
				System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
			}
		    
		 System.out.println("Search Operation Enter Id");
         int id=sc.nextInt();		 
		 
         Employee employee2 = session.get(Employee.class, id);
         if(employee2!=null) {
        	 System.out.println("found ");
           System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
         }
         else
        	 System.out.println("not found ");
	}
}





