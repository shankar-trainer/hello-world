package com.nec.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcedureProgram1 {

	public static void main(String[] args) {

		try {
			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); //1st way of
			// loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");// 2nd way of loading the driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nec", "root", "");

			CallableStatement cst = connection.prepareCall("{call avg_salary()}");
			ResultSet rs = cst.executeQuery();
			rs.next();
			System.out.println("average salary is " + rs.getFloat(1));
			
			System.out.println("\nsearch_employee procedure\n");

			CallableStatement cst1 = connection.prepareCall("{call search_employee(?,?,?)}");
			cst1.setInt(1, 1001);
			
			cst1.registerOutParameter(2, java.sql.Types.VARCHAR);
			cst1.registerOutParameter(3, java.sql.Types.FLOAT);
			cst1.execute();
			
			String nm=cst1.getString(2);
			float sal=cst1.getFloat(3);
			
			if(nm!=null || sal!=0)
			{
			System.out.println("found \n name is "+nm);
			System.out.println(" salary is "+sal);
			}
			else
				System.out.println("not found ");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
