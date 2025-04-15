import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.dao.EmployeeDao;
import com.cts.model.Employee;

public class Employeemain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeDao.class);
		EmployeeDao dao = ctx.getBean(EmployeeDao.class);

		Employee employee = new Employee();
		employee.setEmpId(6767676);
		employee.setEmpName("rahul sharma");
		employee.setEmpSalary(12000);

		Employee employee1 = new Employee();
		employee1.setEmpId(6767671);
		employee1.setEmpName("pankaj sharma");
		employee1.setEmpSalary(17000);

		try {
			dao.addEmployee(employee);
			dao.addEmployee(employee1);
			dao.addEmployee(employee1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			System.out.println("all employee list");
			dao.getAllEmployees().forEach(System.out::println);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
