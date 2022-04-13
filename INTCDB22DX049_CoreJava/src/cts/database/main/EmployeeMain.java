package cts.database.main;

import java.sql.SQLException;
import java.util.Scanner;

import cts.database.dao.EmployeeDao;
import cts.database.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp;

		String ch = "y";
		Scanner sc = new Scanner(System.in);
		try {
			EmployeeDao dao = new EmployeeDao();
			while (ch.equals("y")) {

				System.out.println("1.Add Employee");
				System.out.println("2.Search Employee");
				System.out.println("3.Show All Employee");
				int op = sc.nextInt();

				switch (op) {
				case 1:
					emp = null;
					System.out.println("Enter id name and salary ");
					emp = new Employee();
					emp.setId(sc.nextInt());
					sc.nextLine();
					emp.setName(sc.nextLine());
					emp.setSalary(sc.nextFloat());
					if (dao.addRecord(emp))
						System.out.println("Record Added");
					else
						System.out.println("Record already present");
					break;

				case 2:
					emp = null;
					System.out.println("Enter id ");
					emp = dao.searchRecord(sc.nextInt());
					if (emp == null)
						System.out.println("employee not found");
					else {
						System.out.println("Employee found");
						System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
					}
					break;

				case 3:
					System.out.println("All Employee");
					for (Employee emp1 : dao.getAllEmployee())
						System.out.println(emp1.getId() + "\t" + emp1.getName() + "\t" + emp1.getSalary());

					break;
				default:
					System.out.println("wrong operation");

				}
				System.out.println("Continue y\\n");
				ch = sc.next();

			}
		} catch (SQLException e) {
			System.err.println(e);
		}

	}
}
