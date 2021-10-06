package IO;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		User user = new User();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter roll");
			user.setRoll(Integer.parseInt(reader.readLine()));

			System.out.println("Enter Name");
			user.setName((reader.readLine()));

			System.out.println("Enter age");
			user.setAge(Integer.parseInt(reader.readLine()));
			System.out.println("Save  object data to the file ");
			if(reader.readLine().equalsIgnoreCase("y"))
			{
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("user.ser"));
			objectOutputStream.writeObject(user);
			
			//new ObjectOutputStream(new FileOutputStream("user.ser")).writeObject(user);
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
