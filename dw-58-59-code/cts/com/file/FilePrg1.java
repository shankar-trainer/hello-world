package cts.com.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FilePrg1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("C:/welcome1/hello.txt");
				//("C:\\welcome1\\hello.txt");// window style path
		
		int x=fileInputStream.read();
		
		while(x!=-1) {
			System.out.print((char)x);
			x=fileInputStream.read();
		}
		fileInputStream.close();
	}
}
