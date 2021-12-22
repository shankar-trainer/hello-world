package com.cognizant.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample3 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileInputStream=new FileInputStream("C:/welcome/hello.txt");
            
			byte b[]=new byte[300];// unix path 
			
			fileInputStream.read(b);
			
			for(byte b1:b)
				System.out.print((char)b1);
		    
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
