package edu.chitkara.fileio;

import java.io.File;
import java.io.IOException;

public class FileProgram1 {

	public static void main(String[] args) {
		
		File file=new  File("c:\\");
		String[] list = file.list();
	    for(String s:list)
	    	System.out.println(s);	
	    
	    File file1=new  File("c:\\chitkara");
	    System.out.println(file1.mkdir());
	  
	    File file2=new  File("c:\\chitkara\\hello.txt");
	    try {
			System.out.println(file2.createNewFile());
		
			System.out.println(file2.getPath());
			System.out.println(file2.getAbsolutePath());
			System.out.println(file2.getName());
			System.out.println(file2.getParentFile());
			
			
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    
		  
		
	    
	}
}
