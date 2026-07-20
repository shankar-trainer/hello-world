package com.coforge;

import java.time.LocalDate;
import java.util.Scanner;

import com.coforge.dao.EmployeeDao;
import com.coforge.model.Employee;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String ch = "y";

		while (ch.equals("y")) {
			System.out.println("1. Add Employee");
			System.out.println("2. Show All Employee");
			System.out.println("3. Search Employee by id");
			System.out.println("4. delete Employee by id");
			System.out.println("5. Update Employee");

			int operation = scanner.nextInt();

			Employee emp1;

			EmployeeDao dao = new EmployeeDao();

			switch (operation) {
			case 1:
				emp1 = null;
				emp1 = new Employee();
				System.out.println("name and dob(yyyy-dd-mm)");

//				emp1.setId(scanner.nextInt());
				scanner.nextLine();
				emp1.setName(scanner.nextLine());
				String dt = scanner.next();

				LocalDate date = LocalDate.parse(dt);
				emp1.setDob(date);
				dao.addEmployee(emp1);
				System.out.println("record added");
				break;
			case 2:
				dao.showAllEmployee()
						.forEach(a -> System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getDob()));
				break;
			case 3:
				System.out.println("enter id ");
				Employee e = dao.searchEmployeeById(scanner.nextInt());
				System.out.println("found ");
				System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getDob());
				break;
			case 4:
				System.out.println("enter id ");
				int id=scanner.nextInt();
				dao.deleteEmployeeById(id);
				System.out.println("employee deleted");
				break;
			
			case 5:
				emp1 = null;
				emp1 = new Employee();
				System.out.println(" enter id name and dob(yyyy-dd-mm)");

				emp1.setId(scanner.nextInt());
				scanner.nextLine();
				emp1.setName(scanner.nextLine());
				dt = scanner.next();

				date = LocalDate.parse(dt);
				emp1.setDob(date);
				dao.updateEmployee(emp1);
				System.out.println("record updated");
				break;

				
			default:
				break;
			}
			System.out.println("continue y\\n");
			ch = scanner.next();
		}
	}
}
