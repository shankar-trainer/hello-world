package com.cts.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileEx5 {

	public static void main(String[] args) {
		try {

			FileInputStream fileInputStream = new FileInputStream
					//("C:\\hello\\welcome2.txt");  // window style path 
					//("C:/hello/welcome2.txt");// unix style path 

			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

			byte b[] = new byte[10];

			int p = bufferedInputStream.read(b);

			System.out.println(p);

			for (byte c : b) {
				System.out.print((char) c);
			}

			fileInputStream.close();
		}

		catch (IOException e) {
		}

	}
}
