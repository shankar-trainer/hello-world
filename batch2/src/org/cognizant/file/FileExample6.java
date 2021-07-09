package org.cognizant.file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample6 {

	public static void main(String[] args) {
		try {
			DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream
					("C:\\welcome\\empdata.txt"));
			dataOutputStream.writeInt(767667);
			dataOutputStream.writeUTF("lalit shankar");
			dataOutputStream.writeFloat(12000);
			System.out.println("data added to the file ");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
