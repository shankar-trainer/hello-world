package com.capgemini.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataStreamProgram1 {

	
	public static void main(String[] args) throws IOException {
		
		DataOutputStream stream=new DataOutputStream(new FileOutputStream("emp.dat"));
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id ");
		int id=sc.nextInt();
		
		System.out.println("Enter Name ");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter Salary ");
		float salary=sc.nextFloat();
		
		stream.writeInt(id);
		stream.writeUTF(name);
		stream.writeFloat(salary);
		
		System.out.println("data added");
		
		stream.close();
		sc.close();
		
		DataInputStream stream2=new DataInputStream(new FileInputStream("emp.dat"));
		System.out.println("id is "+stream2.readInt());
		System.out.println("name is "+stream2.readUTF());
		System.out.println("salary is "+stream2.readFloat());
	  
		stream2.close();
		
	}
}
