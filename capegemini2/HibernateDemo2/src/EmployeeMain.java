import org.com.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee emp1 = new Employee();
		emp1.setId(10002);

		emp1.setName("sohan kumar");
		emp1.setSalary(40000);

		transaction.begin();
		session.save(emp1);
		transaction.commit();
		session.close();
		factory.close();

		System.out.println("Record added");
	}
}
