package com.cognizant.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderPrg1 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("c:\\welcome\\hello.txt");
		int p;

		while ((p = reader.read()) != -1)
			System.out.print((char) p);
		reader.close();

		Scanner sc = new Scanner(System.in);

		FileWriter fileWriter = new FileWriter("c:\\welcome\\hello1.txt");

		 String s=" ";
		while(!s.equals("y")) {
			System.out.println("Enter line ");
			
			fileWriter.write(sc.nextLine());
			System.out.println("exit y\\n ");
			s=sc.next();
		}
		
		fileWriter.close();
	}
}
