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
		
		Configuration configuration=new Configuration();
        configuration.configure();
        
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction transaction=session.getTransaction();
     
        /*Employee employee=new Employee();
        employee.setId(10004);
        employee.setName("pratibha verma");
        employee.setSalary(85000);
        
        transaction.begin();
        session.save(employee);
        transaction.commit();
        */
        
        Query query = session.createQuery("from Employee");
        
        List<Employee> list = query.list();
        Employee emp;
        for (int i = 0; i < list.size(); i++) {
			 emp=list.get(i);
        	System.out.println(emp.getId()+" "+emp.getName()+"  "+emp.getSalary());
		}
        
        System.out.println("search  the object ");
        System.out.println("Enter Id ");
        int id=sc.nextInt();   
        Employee employee = session.get(Employee.class, id);
        if(employee!=null) {
        	System.out.println("found with id "+id);
            System.out.println(employee.getId()+"  "+employee.getName()+" "+employee.getSalary()); 	
        }
        else
        System.out.println("not found with id "+id);
        
        System.out.println("delete object");
	
        System.out.println("Enter Id ");
          id=sc.nextInt();   
        employee = session.get(Employee.class, id);
    
        if(employee!=null) {
            transaction.begin();
                    	
        	session.delete(employee);
            transaction.commit();
            	
        	System.out.println("employee foundand is deleted ");
        }
        else
        System.out.println("employee not found and cannot be deleted  ");
    
	
	}
}
