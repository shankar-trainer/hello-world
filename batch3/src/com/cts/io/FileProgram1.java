package com.cts.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileProgram1 {

	public static void main(String[] args) {
		FileInputStream stream=null;
		int x;
		try {
			stream=new FileInputStream("C:\\hello\\welcome.txt");
			x = stream.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=stream.read();
			}
			
		} catch (IOException e) {
			System.err.println(e);
		}
		finally {
			
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
