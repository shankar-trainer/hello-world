package cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cts.database.util.DataBaseUtil;

public class ProcedureCall2 {

	public static void main(String[] args) {
		try {
			Connection con = DataBaseUtil.myConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  id to search employee");
			int id = sc.nextInt();

			CallableStatement cst = con.prepareCall("{call searchemp(?,?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2, java.sql.Types.INTEGER);
			cst.registerOutParameter(3, java.sql.Types.FLOAT);

			 cst.execute();
			 String name=cst.getString(2);
			 float salary=cst.getFloat(3);
			 
			  if(name!=null)
				{
				  System.out.println("Record Found with id "+id);
				  System.out.println(cst.getString(2) + "\t" + cst.getFloat(3));
				}
				else
				  System.out.println("Record Not Found with id "+id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
/*
 * delimiter // create procedure searchemp(in id1 int,out name1 varchar(20), out
 * salary1 float(10,2)) begin select name, salary into name1, salary1 from
 * employee where id=id1; end; // call searchemp(90001,@name,@salary);
 * select @name,@salary;
 * 
 */