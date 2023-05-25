package edu.chitkara.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream=new  
	FileOutputStream("c:/chitkara/test2.txt", true);
    //FileOutputStream("test2.txt", true);
		             // using \ is window path c:\\chitkara\\test2.txt
		             // using unix path  with /  
		fileOutputStream.write("hello world\n".getBytes());
		fileOutputStream.close();
		
		
		
	}
	
}
