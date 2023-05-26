package edu.chitkara.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadUserObject {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream inputStream = new ObjectInputStream(new 
				FileInputStream("user.txt"));

		User user = (User) inputStream.readObject();
		System.out.println("id " + user.getId());
		System.out.println("name " + user.getName());
		System.out.println("salary " + user.getSalary());
	}
}
