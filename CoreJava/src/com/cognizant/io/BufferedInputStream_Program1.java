package com.cognizant.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_Program1 {
	
	public static void main(String[] args) throws IOException  {
		
		BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("c:\\welcome\\hello.txt")); 
		//StringExample
		
		BufferedInputStream bufferedInput=new BufferedInputStream(bufferedInputStream);
		int x=0;
		
		while((x=bufferedInput.read())!=-1) {
			System.out.print((char)x);
		}			
		
	}

}
