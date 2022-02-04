
import java.util.List;

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
		 
		 Employee employee=new Employee();
		 employee.setId(10002);
		 employee.setName("preetam kumar");
		 employee.setSalary(78000.00f);
		 
		  session.save(employee);
		 tr.commit();
		 
		 System.out.println("Record added");
		 //HQL Hibernate Query Language
	      Query createQuery = session.createQuery("from  Employee");
		    List<Employee> list = createQuery.list();
	          for (Employee employee2 : list) {
				System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
			}
		    
		 
	}
}
