package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserMain2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		User user = null;

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("user.ser"));
		user = (User) inputStream.readObject();

		System.out.println(user.getRoll() + " " + user.getName() + " " + user.getAge());
		inputStream.close();
	}
}
