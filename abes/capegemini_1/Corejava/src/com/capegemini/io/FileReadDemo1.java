package com.capegemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {

		FileInputStream inputStream=new FileInputStream
		
				("c:/corejava/capegemini/hello2.txt");
		 
		
		inputStream.skip(200);
		
		int x=inputStream.read();
			
		
		System.out.println(inputStream.available());
		
		while(x!=-1){
			System.out.print((char)x);
			x=inputStream.read();
			
		}
	}
}
