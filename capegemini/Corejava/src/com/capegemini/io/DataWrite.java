package com.capegemini.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataWrite {

	public static void main(String[] args) throws IOException {
		
  		
		DataOutputStream dataOutputStream=new 
				DataOutputStream
				(new FileOutputStream("emp.dat"));
		System.out.println("Enter id name and salary");
		
		Scanner scanner=new Scanner(System.in);
		
		dataOutputStream.writeInt(scanner.nextInt());
		scanner.nextLine();
		dataOutputStream.writeUTF(scanner.nextLine());
		
		dataOutputStream.writeFloat(scanner.nextFloat());
		
		
		
	}
}
