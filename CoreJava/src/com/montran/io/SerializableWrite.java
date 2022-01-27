package com.montran.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableWrite {

	public static void main(String[] args) {
		Worker worker1 = new Worker(788787, "jack", 1000);
		worker1.setCountry("nepal");
		Worker worker2 = new Worker(788788, "mack", 1100);
		worker1.setCountry("srilanka");
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("c:/welcome/emp.txt"));
			objectOutputStream.writeObject(worker1);
			objectOutputStream.writeObject(worker2);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
