package com.example.database;

import java.sql.SQLException;
import java.util.InputMismatchException;

public class JdbcPrg3Main {
public static void main(String[] args) {
	JdbcPrg3 jdbcPrg3;
	try {
		jdbcPrg3 = new JdbcPrg3();
	//	jdbcPrg3.createTable();
		
//		jdbcPrg3.addRecord();
		//jdbcPrg3.addRecord1();
		
		jdbcPrg3.showAllResult();
	
	//	jdbcPrg3.removeRecord();
		System.out.println("\n");
	//	jdbcPrg3.updateRecord();
		jdbcPrg3.searchRecord();
		
		System.out.println("\n");
		
		
		//jdbcPrg3.showAllResult();
		
		jdbcPrg3.closeResources();
		
		//jdbcPrg3.showAllResult();
		
	} catch (ClassNotFoundException | SQLException | InputMismatchException e) {
		System.err.println(e.getMessage());
	}
}
}
