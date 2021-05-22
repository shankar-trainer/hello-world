package com.cts.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEx2 {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		Scanner scanner=null;
		
		try {
			scanner=new Scanner(System.in);
			fileOutputStream = new FileOutputStream("C:\\hello\\welcome2.txt",true);

			  String s="";
			  
			  while(!s.equalsIgnoreCase("quit123")) {
				  System.out.println("Enter Line ");
				  s=scanner.nextLine();
				  fileOutputStream.write(s.concat("\n").getBytes());
			  }
			
			System.out.println("wrote to the file ");
		} catch (IOException e) {
		}

		finally {
			try {
				fileOutputStream.close();
				scanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
