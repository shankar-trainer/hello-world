package edu.chitkara.fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadWithBuffer {

	public static void main(String[] args) {

		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					new FileInputStream("c:\\chitkara\\hello.txt"));

//			int b1;
//			while((b1=bufferedInputStream.read())!=-1) {
//		     System.out.print((char)b1);		
//			}

			byte b[] = new byte[100];
			bufferedInputStream.skip(50);

			bufferedInputStream.read(b);
			for (byte b1 : b)
				System.out.print((char) b1);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
