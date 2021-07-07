package org.cognizant.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BRDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\welcome\\hello1.txt");
		BufferedReader bufferedReader=new BufferedReader(reader);
		
		String s=bufferedReader.readLine();
		
		while(s!=null) {
			System.out.println(s);
			s = bufferedReader.readLine();
		}
		reader.close();
		bufferedReader.close();
	}
}
