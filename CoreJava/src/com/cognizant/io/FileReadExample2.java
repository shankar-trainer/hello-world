package com.cognizant.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample2 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileInputStream=new FileInputStream("C:/welcome/hello.txt");
                                                    			// unix path 
		    
			fileInputStream.skip(250);
			int x=fileInputStream.read();
		    System.out.println("after skip of 250 chars available is "+fileInputStream.available());
			
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
