package cts.com.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter=new FileWriter("C:\\welcome1\\greeting.txt", true);
		fileWriter.write("hello world");
		fileWriter.write("\n will work ");
		fileWriter.close();
		System.out.println("added to file ");
		
	}
}
