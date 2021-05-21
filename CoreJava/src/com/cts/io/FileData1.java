package com.cts.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileData1 {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			
			DataOutputStream stream1=new DataOutputStream(new FileOutputStream("emp.dat"));
			System.out.println("Enter empId ");
			stream1.writeInt(sc.nextInt());

			System.out.println("Enter empName ");
			sc.nextLine();
			
			stream1.writeUTF(sc.nextLine());
		
			System.out.println("Enter emp Salary ");
			stream1.writeFloat(sc.nextFloat());
			
			stream1.close();
			sc.close();
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
