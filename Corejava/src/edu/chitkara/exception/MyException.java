package edu.chitkara.exception;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.sql.SQLException;

class MyException {
	Scanner sc;
	String name;

	MyException() {
		sc = new Scanner(System.in);
	}

	void input() throws FileNotFoundException,SQLException,Exception {
		// name=sc.next();
		name = null;
		if (name == null)
			// throw new NullPointerException(" name is null");
			// throw new RuntimeException(" name is null");
			// throw new Exception(" name is null");
			throw new FileNotFoundException(" name is null");
		else
			System.out.println("my name is " + name);
	}

	public static void main(String args[])
	// throws FileNotFoundException
	{
		try {
			new MyException().input();
		}
		// catch(FileNotFoundException e)
		catch (Exception e) {
			// System.err.println(e);
			System.err.println(e.getMessage());
		}
	}

}
