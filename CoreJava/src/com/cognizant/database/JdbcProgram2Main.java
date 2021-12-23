package com.cognizant.database;

import java.sql.SQLException;
import java.util.Scanner;

public class JdbcProgram2Main {

	public static void main(String[] args) {
		try {
			Scanner  sc=new Scanner(System.in);
			
			JdbcProgram2 program2 = new JdbcProgram2();
			
			System.out.println("Employee Add Record Operation");
			//program2.addRecord();
			program2.addRecord1();
			System.out.println("Employee Show All Record Operation");
			program2.getAllRecord();
			
			System.out.println("Employee Serach  Operation");
			System.out.println("Enter id to search ");
		
			Employee searchEmployee=program2.searchEmployee(sc.nextInt());
			if(searchEmployee==null)
				System.out.println("id not found");
			else {
				System.out.println("Employee found ");
				
				System.out.println(searchEmployee.getId()+"  "+searchEmployee.getName()+"  "+searchEmployee.getSalary());
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
