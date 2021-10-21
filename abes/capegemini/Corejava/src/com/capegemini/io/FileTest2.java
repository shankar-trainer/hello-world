package com.capegemini.io;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
		File file = new File("c:/corejava/greeting.txt");
		
	if(file.exists())
		System.out.println("file is present");
	else
	{
		System.out.println("file not present");
		file.createNewFile();
	}
		
		
	}
}
