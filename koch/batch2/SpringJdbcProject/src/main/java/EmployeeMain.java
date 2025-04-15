import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DuplicateKeyException;

import com.cts.config.Config;
import com.cts.dao.EmployeeDao;
import com.cts.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		EmployeeDao dao = applicationContext.getBean(EmployeeDao.class);

		String ch = "y";
		Scanner scanner = new Scanner(System.in);

		while (ch.equals("y")) {
			System.out.println("1.Add Employee");
			System.out.println("2.ShowAll Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Search  Employee");

			int op = scanner.nextInt();

			switch (op) {
			case 1:
				System.out.println("Add Id name and salary");
				Employee employee = new Employee();
				employee.setId(scanner.nextInt());
				scanner.nextLine();
				employee.setName(scanner.nextLine());
				employee.setSalary(scanner.nextFloat());
				try {
					boolean status = dao.saveEmploye(employee);
					if (status)
						System.out.println("Record added");
				} catch (DuplicateKeyException e) {
					// System.err.println(e.getMessage());
					System.err.println("duplicate id error ");
				}
				break;
			case 2:
				try {
				dao.showAll().forEach(a -> System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getSalary()));
				}
				catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 3:
				System.out.println("Add Id name and salary");
				employee=null;
				employee = new Employee();
				employee.setId(scanner.nextInt());
				scanner.nextLine();
				employee.setName(scanner.nextLine());
				employee.setSalary(scanner.nextFloat());
				try {
					boolean status = dao.updateEmploye(employee);
					if (status)
						System.out.println("Record Updated");
				} catch (Exception e) {
					 System.err.println(e.getMessage());
				}				
				break;

			case 4:
				System.out.println("Enter id to delete");
				if(dao.deleteEmploye(scanner.nextInt()))
					System.out.println("deleted");
				else 
					System.out.println("no record found");
				break;

			case 5:
				try {
				System.out.println("Enter id to delete");
				Employee emp=dao.searchById(scanner.nextInt());
				System.out.println("Employee found ");
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
				}
				catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			default:
				System.out.println("wrong operation input");
				break;

			}
			System.out.println("continue y\\n");
			ch = scanner.next();
		}
		scanner.close();
	}
}
