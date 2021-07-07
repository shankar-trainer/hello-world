package org.cognizant.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite2 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\welcome\\hello1.txt");
		FileWriter writer=new FileWriter("copy.txt");
		int x;
		
		while((x=reader.read())!=-1) {
			writer.write(x);
		}
		writer.close();
		reader.close();
	}
}
