package com.coforge.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.dao.EmployeeDao;
import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		
		String  ch="y";
		Scanner scanner=new Scanner(System.in);
		
		EmployeeDao dao=new EmployeeDao();
		Employee employee;
		
		while(ch.equals("y")) {
			System.out.println("1. Add Employee");
			System.out.println("2. Search  Employee");
			System.out.println("3. Show All Employee");
			
			int op=scanner.nextInt();
			
			switch (op) {
			case 1:
				employee=null;
				employee=new Employee();
				System.out.println("Enter id name and salary");
				employee.setId(scanner.nextInt());
				scanner.nextLine();
				employee.setName(scanner.nextLine());
				employee.setSalary(scanner.nextFloat());
				
				try {
					if(dao.addEmployee(employee))
						System.out.println("Record added");
					else
						System.out.println("Record with id already present");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			case 3:
				dao.getAllEmployee().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));
				break;
			default:
				break;
			}
			System.out.println("continue y\\n");
			ch=scanner.next();
		}
		
	}
}
