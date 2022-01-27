package com.montran.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample4 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  inputStream=new FileInputStream("c:/welcome/test1.txt");
		
		byte b[]=new byte[100];
		
		inputStream.read(b);
		
		for (byte c : b) {
			System.out.print((char)c);
		}
		
		inputStream.close();
	}
}
