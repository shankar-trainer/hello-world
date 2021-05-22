package com.cts.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx1 {
	
	public static void main(String[] args) throws IOException {

		FileOutputStream fileOutputStream=new FileOutputStream("C:\\hello\\welcome.txt");
		
		fileOutputStream.write("geeting from java ".getBytes());
		System.out.println("wrote to the file ");
		
		fileOutputStream.close();
	}
}
