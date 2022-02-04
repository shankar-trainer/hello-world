import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.lpu.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sf = configuration.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction transaction = session.getTransaction();
		
		Employee emp=new Employee();
		
		emp.setId(10001);
		emp.setName("sita laxmi");;
		emp.setSalary(56000.00f);
		
		transaction.begin();
       session.save(emp);
       transaction.commit();
       System.out.println("Record added");
       
	}
}
