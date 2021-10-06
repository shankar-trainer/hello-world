package com.capegemini.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CVSFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream
				("student.csv");

		fileOutputStream.write("roll".concat(",").getBytes());
		fileOutputStream.write("name".concat(",").getBytes());
		fileOutputStream.write("grade".concat("\n").getBytes());
		
		Scanner scanner=new Scanner(System.in);
		
		String roll,name,grade;
				
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter roll name and grade");
		    roll=scanner.next();
		    scanner.nextLine();
		    name=scanner.nextLine();
		    grade=scanner.next();
		    //grade=grade.substring(0);
			fileOutputStream.write(roll.concat(",").getBytes());
			fileOutputStream.write(name.concat(",").getBytes());
			fileOutputStream.write(grade.concat("\n").getBytes());
		}
	}
}
