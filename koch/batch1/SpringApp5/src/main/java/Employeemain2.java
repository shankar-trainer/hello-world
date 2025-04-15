import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.dao.EmployeeDao;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class Employeemain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeService.class);
		EmployeeService service = ctx.getBean(EmployeeService.class);

		Employee employee = new Employee();
		employee.setEmpId(6767676);
		employee.setEmpName("rahul sharma");
		employee.setEmpSalary(12000);

		Employee employee1 = new Employee();
		employee1.setEmpId(6767671);
		employee1.setEmpName("pankaj sharma");
		employee1.setEmpSalary(17000);

		try {
			System.out.println("all employee list");
			service.getEmplList().forEach(System.out::println);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			service.addEmployee(employee);
			service.addEmployee(employee1);
			service.addEmployee(employee1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			System.out.println("all employee list");
			service.getEmplList().forEach(System.out::println);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(" search employee with id 6767671");
			Employee searchEmployeeById = service.searchEmployeeById(6767671);
			System.out.println("found "+searchEmployeeById);

			System.out.println(" search employee with id 676767");
			
			searchEmployeeById = service.searchEmployeeById(676767);
			System.out.println("found "+searchEmployeeById);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("update employee");

			Employee employee2 = new Employee();
			employee2.setEmpId(6767671);
			employee2.setEmpName("ajay sharma");
			employee2.setEmpSalary(89000);
			
			 service.updateEmployee(employee2);
         System.out.println("employee updated ");
         System.out.println(service.searchEmployeeById(employee2.getEmpId()));
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
