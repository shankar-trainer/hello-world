package com.nec.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStream_Data {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("emp.dat"));
			
			System.out.println("Enter employee id ");
			dataOutputStream.writeInt(scanner.nextInt());
			
			System.out.println("Enter employee name ");
			scanner.nextLine();
			dataOutputStream.writeUTF(scanner.nextLine());
			
			System.out.println("Enter employee salary ");
			dataOutputStream.writeFloat(scanner.nextFloat());
		    
			dataOutputStream.close();
			
			 DataInputStream dataInputStream=new DataInputStream(new FileInputStream("emp.dat"));
			 
		   System.out.println("Id is "+dataInputStream.readInt());
		   System.out.println("Name is "+dataInputStream.readUTF());
		   System.out.println("Salary is "+dataInputStream.readFloat());
		   
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
