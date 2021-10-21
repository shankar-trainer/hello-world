package com.capegemini.io;

import java.io.File;
import java.io.IOException;

public class FileTest3 {

	public static void main(String[] args) throws IOException {
		File file = new File("c:/corejava/capegemini/org/com/hello");
		
	if(file.exists()){
		System.out.println("folder is present");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
	}
	else
	{
		System.out.println("folder not present");
		//file.mkdir();
		file.mkdirs();
	
	}
		
		
	}
}
