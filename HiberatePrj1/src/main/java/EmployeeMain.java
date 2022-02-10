import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.lpu.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();//read hibernate.cfg.xml 
		
		//SessionFactory is connection provider 
		SessionFactory sf = configuration.buildSessionFactory();
		
		//Session is database connection
		Session session = sf.openSession();
		
		Transaction transaction = session.getTransaction();
		
		Employee employee=new Employee();
		employee.setId(10001);
		employee.setName("hari nanddan");
		employee.setSalary(24000.00f);

		transaction.begin();
		session.save(employee);
		transaction.commit();
		
		System.out.println("Record added");
		
	}
}
