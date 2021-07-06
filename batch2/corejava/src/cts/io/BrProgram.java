package cts.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BrProgram {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new FileReader("c:/hello/abc.txt"));
		String s;
		
		while((s=bufferedReader.readLine())!=null) {
			System.out.println(s);
		}
		
		bufferedReader.close();
		
	}
}
