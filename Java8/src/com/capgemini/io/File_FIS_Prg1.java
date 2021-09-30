package com.capgemini.io;

import java.io.FileInputStream;
import java.io.IOException;

public class File_FIS_Prg1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis=new FileInputStream("C:\\welcome1\\hello.txt");
	    
		int x=fis.read();
		
		while(x!=-1) {
			System.out.print((char)x);
			x=fis.read();
		}
		fis.close();
	}
}
