package com.cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream =null;
		try {
			inputStream= new FileInputStream("C:\\hello\\test1.txt");
			/*
			 * int x=inputStream.read();
			 * 
			 * 
			 * 
			 * while(x!=-1) { System.out.print((char)x); x=inputStream.read(); }
			 */
			
		   byte b[]=new byte[100];  
			
		   //inputStream.skip(20);
			inputStream.read(b);
			
			for(byte b1:b) {
				System.out.print((char)b1);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			inputStream.close();
		}
	}
}
