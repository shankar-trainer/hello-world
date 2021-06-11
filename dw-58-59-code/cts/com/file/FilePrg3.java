package cts.com.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FilePrg3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("C:/welcome1/hello.txt");
				//("C:\\welcome1\\hello.txt");// window style path
		
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
     byte b[]=new byte[300];
     
		bufferedInputStream.read(b);
		
		for (byte c : b) {
			System.out.print((char)c);
		}
		
		fileInputStream.close();
	}
}
