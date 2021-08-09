package com.montran.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDataPrg1 {

	public static void main(String[] args) throws IOException {

		DataOutputStream stream = new DataOutputStream(new FileOutputStream("emp.dat"));

		stream.writeInt(100001);
		stream.writeUTF("mohan kumar");
		stream.writeFloat(12000.00f);

		stream.writeInt(100002);
		stream.writeUTF("sohan kumar");
		stream.writeFloat(17000.00f);

		stream.close();

		DataInputStream stream2 = new DataInputStream(new FileInputStream("emp.dat"));

		for (int i = 0; i <= 1; i++) {

			System.out.println("id is " + stream2.readInt());
			System.out.println("name is " + stream2.readUTF());
			System.out.println("salary is " + stream2.readFloat());

		}

		stream2.close();
	}
}
