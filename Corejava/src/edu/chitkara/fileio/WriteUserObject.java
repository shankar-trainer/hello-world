package edu.chitkara.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteUserObject {

	public static void main(String[] args) {
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.txt"));
			User user = new User(5445445, "jai kumar", 45000);

			objectOutputStream.writeObject(user);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
