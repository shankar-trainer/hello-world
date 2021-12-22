package com.cognizant.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample1 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileInputStream=new FileInputStream("C:/welcome/hello.txt");
		                                                       // unix path 
			int x=fileInputStream.read();
		    
			while(x!=-1) {
				System.out.print((char)x);
				x=fileInputStream.read();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
