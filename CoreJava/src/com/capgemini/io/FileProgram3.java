package com.capgemini.io;

import java.io.File;

public class FileProgram3 {

	public static void main(String[] args) {
		
		File file = new File("C:/welcome/assignment");// unix path
		File file1 = new File("C:/welcome/hello.txt");// unix path
		

		System.out.println(file.isDirectory());
		System.out.println(file1.isFile());
	
		
		  
		System.out.println("read permission "+file1.canRead());
		System.out.println("write permission "+file1.canWrite());
		System.out.println("execute permission "+file1.canExecute());
		
		file1.delete();
		file.delete();
		

	}
}
