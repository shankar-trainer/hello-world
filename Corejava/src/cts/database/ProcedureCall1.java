package cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cts.database.util.DataBaseUtil;

public class ProcedureCall1 {
//allemp();
	public static void main(String[] args) {
		try {
			Connection con = DataBaseUtil.myConnection();

			CallableStatement cst = con.prepareCall("{call allemp()}");
			ResultSet rs = cst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
/*
delimiter //
create  procedure   allemp()   
begin 
select * from employee;
end;
//
call allemp();


*/