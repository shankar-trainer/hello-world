package com.capgemini.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_FOS_Prg1 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c:\\welcome1\\test1.txt",true);
			fos.write("hello world\n".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		    try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
	}
}
