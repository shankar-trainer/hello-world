package edu.chitkara.fileio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataWritePrg1 {

	public static void main(String[] args) {

		int id;
		String name;
		float salary;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id name and salary");

		id = sc.nextInt();
		sc.nextLine();
		name = sc.nextLine();
		salary = sc.nextFloat();

		try {
			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("employee.txt"));

			dataOutputStream.writeInt(id);
			dataOutputStream.writeUTF(name);
			dataOutputStream.writeFloat(salary);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
