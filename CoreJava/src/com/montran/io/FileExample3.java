package com.montran.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  inputStream=new FileInputStream("c:/welcome/test1.txt");
		
		inputStream.skip(100);
		
		int x=inputStream.read();
		
		while(x!=-1) {
			System.out.print((char)x);
			x=inputStream.read();
		}
		
		inputStream.close();
	}
}
