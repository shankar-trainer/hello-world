package com.montran.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("c:/welcome/emp.txt"));

		Worker worker = (Worker) inputStream.readObject();

		System.out.println(worker);
		worker = (Worker) inputStream.readObject();
		System.out.println(worker);
		inputStream.close();
	}
}
