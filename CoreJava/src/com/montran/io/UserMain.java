package com.montran.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("c:/welcome/user.txt"));

		User user1 = new User(78878787, "kamal kant ", "gurgaon");
		User user2 = new User(78878788, "rama kant ", "noida");

		objectOutputStream.writeObject(user1);
		objectOutputStream.writeObject(user2);

		objectOutputStream.close();

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("c:/welcome/user.txt"));
		User u1 =  (User) inputStream.readObject();
		
		System.out.println(u1);
		u1 = (User) inputStream.readObject();
		System.out.println(u1);

		inputStream.close();

	}
}
