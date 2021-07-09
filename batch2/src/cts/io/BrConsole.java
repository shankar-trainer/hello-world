package cts.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrConsole {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter name");
		String name=reader.readLine();
		System.out.println("enter two marks ");
		float m1=Float.parseFloat(reader.readLine());
		float m2=Float.parseFloat(reader.readLine());
		
		float total=m1+m2;
		float avg=total/2;
		System.out.println("Student details ");
		System.out.println("Name is "+name);
		System.out.println("Marks1 is "+m1);
		System.out.println("Marks1 is "+m2);
		System.out.println("Total Marks is "+total);
		System.out.println("Average marks  "+avg);
		
		
	}
}
