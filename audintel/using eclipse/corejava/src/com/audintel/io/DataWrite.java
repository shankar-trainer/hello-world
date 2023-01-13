package com.audintel.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataWrite {

	public static void main(String[] args) {
		try {
			DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("\\welcome\\emp.dat"));
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter emplpoyee id ");
			int empId=sc.nextInt();
			
			System.out.println("Enter emplpoyee name ");
			sc.nextLine();
			String  empName=sc.nextLine();
			
			System.out.println("Enter emplpoyee salary ");
			float empSalary=sc.nextFloat();
			dataOutputStream.writeInt(empId);
			dataOutputStream.writeUTF(empName);
			dataOutputStream.writeFloat(empSalary);
			
			
			System.out.println("Employee data added ");
			dataOutputStream.close();

			
			 System.out.println("Reading data ");
			  DataInputStream dataInputStream=new DataInputStream(new FileInputStream("/welcome/emp.dat"));
			  
			  System.out.println("Employee Id :"+dataInputStream.readInt());
			  System.out.println("Employee Name :"+dataInputStream.readUTF());
			  System.out.println("Employee Salary :"+dataInputStream.readFloat());
			 
			  dataInputStream.close();
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
