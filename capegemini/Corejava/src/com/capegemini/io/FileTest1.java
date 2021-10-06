package com.capegemini.io;

import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		File file = new File("c:/corejava");
				//("c:\\corejava");

		boolean status = file.isDirectory();
		if (status) {
			String ar[] = file.list();
			for (String string : ar) {
				System.out.println(string);
			}
		}
		else if(file.isFile())
			System.out.println("its a file ");
		
	}
}
