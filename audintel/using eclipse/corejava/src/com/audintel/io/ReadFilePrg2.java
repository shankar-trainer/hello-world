package com.audintel.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFilePrg2 {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("\\welcome\\hello.txt");
			System.out.println("total no of bytes "+fileInputStream.available());
            fileInputStream.skip(100);
            System.out.println("after skip of 100 bytes remaining is "+fileInputStream.available());
            
 //             byte b[]=new byte[200];
              byte b[]=new byte[fileInputStream.available()];
            
              fileInputStream.read(b);
            
			System.out.println( new String(b));
			
			
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
