package com.capgemini.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DOSExample1 {

	public static void main(String[] args) {
		try {
			DataOutputStream stream = new DataOutputStream(new FileOutputStream("emp.dat"));

			System.out.println("Enter id ");
			Scanner scanner = new Scanner(System.in);

			stream.writeInt(scanner.nextInt());
			System.out.println("Enter name ");
			scanner.nextLine();
			stream.writeUTF(scanner.nextLine());

			System.out.println("Enter Salary ");
			stream.writeFloat(scanner.nextFloat());
			stream.close();
			scanner.close();
			
			DataInputStream dataInputStream=new DataInputStream(new FileInputStream("emp.dat"));
			System.out.println("Id is "+dataInputStream.readInt());
			System.out.println("Name is "+dataInputStream.readUTF());
			System.out.println("Salary is "+dataInputStream.readFloat());
			
			dataInputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
