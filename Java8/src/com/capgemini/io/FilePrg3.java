package com.capgemini.io;

import java.io.File;
import java.io.FileFilter;

public class FilePrg3 {
	static class MyFile implements FileFilter {

		@Override
		public boolean accept(File pathname) {
			return pathname.getName().endsWith(".java");
		}
	}

	public static void main(String[] args) {
		File file = new File("C:\\capegemini3\\Java8\\src\\com\\capgemini\\io");
		// File[] listFiles = file.listFiles();
		File[] listFiles = file.listFiles(new MyFile());

		for (File f : listFiles) 
			System.out.println(f);
	}
}
