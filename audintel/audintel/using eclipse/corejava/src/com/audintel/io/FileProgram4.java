package com.audintel.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram4 {

	 static void writeToFile(byte b[]) throws IOException {
		 FileOutputStream outputStream=new FileOutputStream("c:/welcome/hello1",true);// 2nd arg for append as true
		 outputStream.write(b);	 
		 outputStream.close();
	 }
	public static void main(String[] args) throws IOException {
		
		byte b[]=new byte[200];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many line to write ");
		int n=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <n; i++) {
			System.out.println("Enter line ");
			b=sc.nextLine().concat("\n").getBytes();
           writeToFile(b);
		}
		sc.close();
	}
}
