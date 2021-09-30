package com.capgemini.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Buffered_Reader_Prg2 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:/capegemini3/Java8/src/com/capgemini/io/File_FIS_Prg1.java");
			int x;

			BufferedReader breader=new BufferedReader(reader);
		
			
			//while ((x = breader.read()) != -1)
				//System.out.print((char) x);
			
        String s;			
		while ((s = breader.readLine())!=null  )
			System.out.println(s);
			
			breader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
