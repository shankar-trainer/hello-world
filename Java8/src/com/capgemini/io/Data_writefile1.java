package com.capgemini.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_writefile1 {

	public static void main(String[] args) throws IOException {

		DataOutputStream ds = new DataOutputStream(new FileOutputStream("emp.dat"));
		ds.writeInt(87878);
		//ds.writeUTF("suresh kumar");
		//ds.writeUTF("सुरेश कुमार");
		ds.writeUTF("సురేష్ కుమార్");
		ds.writeFloat(78000.00f);
		ds.close();
		
         DataInputStream di=new DataInputStream(new FileInputStream("emp.dat"));
        System.out.println("roll is "+di.readInt());        
        System.out.println("name is "+di.readUTF());        
        System.out.println("salary is "+di.readFloat());        

        di.close();
	}
}
