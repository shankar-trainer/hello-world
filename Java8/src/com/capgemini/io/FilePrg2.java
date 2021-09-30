package com.capgemini.io;

import java.io.File;

public class FilePrg2 {

	public static void main(String[] args) {

		File file = new File("c:\\");
		String[] list = file.list();

		for (String string : list) {
			File file1 = new File(file.getAbsolutePath() + string);

			if (file1.isFile())
				System.out.println(file.getAbsolutePath() + string + "        File");
			if (file1.isDirectory())
				System.out.println(file.getAbsolutePath() + string + "        DIR");

		}

	}

}
