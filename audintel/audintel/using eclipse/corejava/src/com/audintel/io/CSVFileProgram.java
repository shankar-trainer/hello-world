package com.audintel.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileProgram {

	 static void writeToFile(byte b1[],byte b2[],byte b3[]) throws IOException {
		 FileOutputStream outputStream=new FileOutputStream("c:/welcome/employee.csv",true);// 2nd arg for append as true
		 outputStream.write(b1);	 
		 outputStream.write(",".getBytes());
		 
		 outputStream.write(b2);	 
		 outputStream.write(",".getBytes());
		 
		 outputStream.write(b3);	 
		 outputStream.write(",".getBytes());
		 
		 outputStream.close();
	 }
	public static void main(String[] args) throws IOException {
		
		byte b1[]=new byte[50];
		byte b2[]=new byte[50];
		byte b3[]=new byte[50];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many employee record   to write ");
		int n=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <n; i++) {
			System.out.println("Enter Id Name and Salary ");
			b1=sc.nextLine().getBytes();
			b2=sc.nextLine().getBytes();
			b3=sc.nextLine().getBytes();
           writeToFile(b1,b2,b3);
		}
		sc.close();
	}
}
