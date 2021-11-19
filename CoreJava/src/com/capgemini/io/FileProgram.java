package com.capgemini.io;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		
		File file=new File("c:\\");
		File file2;
		
		System.out.println(file.getAbsolutePath());
		String[] list = file.list();
		
		for (String string : list) {
			file2=new File(file.getAbsolutePath()+""+string);	
			if(file2.isDirectory())
			System.out.println(file.getAbsolutePath()+""+string+" \tDIR");
			else if(file2.isFile())
				System.out.println(file.getAbsolutePath()+""+string+" \tFILE");
		}	
		
	}
}
