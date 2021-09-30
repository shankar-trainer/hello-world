package com.capgemini.io;

import java.io.File;
import java.io.IOException;

public class FilePrg1 {

	public static void main(String[] args) {
		File file=new File("C:\\welcome1\\hello.txt");
		
		if(file.exists()) {
			System.out.println("file is present");
		}
		else {
			System.out.println("file not present");
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	
		//File file1=new File("C:\\welcome1\\test");
         //file1.mkdir(); // mkdir will create single directory 		
         
         File file1=new File("C:\\welcome1\\test\\hello\\welcome");
         file1.mkdirs();//// mkdir will create multiple/nested directory		
		
	}
}
