package com.nec.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * @author shankar
 * <br> <B>Read File using byte stream</b>
 *  <br>
 *  <ul>
 *  <li> read using byte by byte
 *  <li> read using byte array
 *  </ul>
 */


public class FileStreamPrg1 {

	public static void main(String[] args) {

		try {
	//		FileInputStream stream = new FileInputStream("C:\\welcome\\hello.txt");
			FileInputStream stream = new FileInputStream("C:/welcome/hello.txt");// unix path style

			int p = stream.read();
			while (p != -1) {
				System.out.print((char)p);
				p = stream.read();
			}

		} catch (IOException e) {
			System.out.println("file not present");
			System.out.println(e.getMessage());
		}
	}

}
