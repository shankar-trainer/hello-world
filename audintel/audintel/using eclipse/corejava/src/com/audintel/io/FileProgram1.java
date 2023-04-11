package com.audintel.io;

import java.io.File;

public class FileProgram1 {

	public static void main(String[] args) {
		int x = 10;
		/*
		 * if (x == 10) System.out.println("x is 10"); else
		 * System.out.println("x is not 10");
		 */
         //ternary operator 
//		System.out.println((x == 10?"x is 10":"x is not 10"));
		
		
	//	File file = new File("c:\\");
		File file = new File("/");
		System.out.println("Directory " + file.isDirectory());
		System.out.println("File " + file.isFile());

		System.out.println("File Path  " + file.getAbsolutePath());

		for (String f : file.list()) {
		 System.out.println(file.getAbsolutePath()+""+f+(file.isFile()?" File":" DIR"));
		}
	}
}
