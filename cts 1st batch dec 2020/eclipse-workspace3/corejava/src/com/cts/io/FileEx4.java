package com.cts.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileEx4 {

	public static void main(String[] args) {
		try {
			
			FileInputStream fileInputStream = new FileInputStream("C:\\hello\\welcome2.txt");

			
			BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
			
			//bufferedInputStream.re
			
			
			int x = 0;
			while ((x = bufferedInputStream.read()) != -1) 
				
			{

				System.out.print((char) x);
			}

			fileInputStream.close();
		}

		catch (IOException e) {
		}

	}
}
