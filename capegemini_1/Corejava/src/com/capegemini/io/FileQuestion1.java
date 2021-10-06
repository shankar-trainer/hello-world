package com.capegemini.io;

import java.io.File;
import java.io.IOException;

public class FileQuestion1 {

	public static void main(String[] args) throws IOException {
		File file = new File("c:\\corejava\\capegemini\\Batch\\");
		if (!file.exists())
			file.mkdir();
		File file1 = new File
			("c:\\corejava\\capegemini\\Batch\\BatchMates.txt");

		if (!file1.exists())
			file1.createNewFile();
		String s[] = file.list();

		for (String string : s) {
			File file2 = new File(file.getPath() + "\\" + string);
			if (file2.isDirectory())
				System.out.println(string + "    " + "DIR");
			if (file2.isFile())
				System.out.println(string + "    " + "FILE");
		}

	}
}
