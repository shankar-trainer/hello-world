package com.audintel.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFilePrg1 {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("\\welcome\\hello.txt");
			/*
			 * int x=fileInputStream.read();
			 * 
			 * while(x!=-1)
			 *  { System.out.print((char)x);
			 *   x=fileInputStream.read(); }
			 */

			int x;
			while ((x = fileInputStream.read()) != -1) {
				System.out.print((char) x);
			}

			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
