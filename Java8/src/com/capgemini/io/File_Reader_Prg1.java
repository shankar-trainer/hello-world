package com.capgemini.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader_Prg1 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");
			FileReader reader1 = new FileReader("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");
			int x;
					
			reader.skip(100);
			
			while ((x = reader.read()) != -1)
				System.out.print((char) x);
			
			
			char ar[]=new char[100];
			reader1.read(ar);
			//reader1.read(ar,10,50);
			
			System.out.println("\nnext reader--------------\n");
			for(char c:ar)
				System.out.print(c);
			reader.close();
			reader1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
