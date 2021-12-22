package com.cognizant.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataFile {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("emp.dat"));
		    
			System.out.println("Enter id ");
		    int id=sc.nextInt();
		    
		    System.out.println("Enter name ");
		    sc.nextLine();
		    String name=sc.nextLine();
		    
		    System.out.println("Enter salary ");
		    float salary=sc.nextFloat();
		    
		    dataOutputStream.writeInt(id);
		    dataOutputStream.writeUTF(name);
		    dataOutputStream.writeFloat(salary);
	        dataOutputStream.close();
	        
	        DataInputStream stream=new DataInputStream(new FileInputStream("emp.dat"));
	        
	        System.out.println("Id is "+stream.readInt() );
	        System.out.println("Name is "+stream.readUTF() );
	        System.out.println("Salary is "+stream.readFloat() );
	        
	        stream.close();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
