package com.capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FISExample2 {

	public static void main(String[] args) throws IOException {


		File file = new File("C:\\welcome\\test2.txt");
		FileInputStream fileInputStream = new FileInputStream(file);

		byte b[]=new byte[20];
		
		 fileInputStream.read(b);
		for (byte c : b) {
		   System.out.print((char)c);	
		}
		 
		
		fileInputStream.close();
	}
}
