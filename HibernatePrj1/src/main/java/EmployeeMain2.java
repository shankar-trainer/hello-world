
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.lpu.dao.EmployeeDao;
import edu.lpu.model.Employee;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		 
		 Scanner sc=new Scanner(System.in);
		 
		 EmployeeDao dao=new EmployeeDao();
	
		 List<Employee> allEmployee = dao.getAllEmployee();
	
		 for (Employee employee2 : allEmployee) {
			System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
		}
		 
		 Employee employee=new Employee();
		 System.out.println("Enter id ");
		 employee.setId(sc.nextInt());
		 System.out.println("Enter name ");
		   sc.nextLine();
		 employee.setName(sc.nextLine());
		 System.out.println("Enter salary ");
		 employee.setSalary(sc.nextFloat());
		 
		 boolean status=dao.addEmployee(employee);
		 if(status)
			 System.out.println("Record added");
		 else
			 System.out.println("Record not added");
			 
		
	}
}





