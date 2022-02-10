import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.lpu.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
        configuration.configure();
        
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction transaction=session.getTransaction();
     
        Employee employee=new Employee();
        employee.setId(10004);
        employee.setName("pratibha verma");
        employee.setSalary(85000);
        
        transaction.begin();
        session.save(employee);
        transaction.commit();
        
        
        Query query = session.createQuery("from Employee");
        
        List<Employee> list = query.list();
        Employee emp;
        for (int i = 0; i < list.size(); i++) {
			 emp=list.get(i);
        	System.out.println(emp.getId()+" "+emp.getName()+"  "+emp.getSalary());
		}
        
	}
}
