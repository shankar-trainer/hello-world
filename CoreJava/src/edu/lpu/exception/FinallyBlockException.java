package edu.lpu.exception;

import java.util.Scanner;

public class FinallyBlockException {

	public static void main(String[] args) {

		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("enter no");
			int p=sc.nextInt();
			int arr[] = { 1, 2, 3, 4, 5, 6 };
			String s = null;

			//System.out.println("array element " + arr[6]);
			 System.out.println("array element "+arr[2]);
			//System.out.println("s " + s.length());
		}

		catch (NullPointerException e) {
			System.err.println("null pointer  error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("array index error");
		} catch (Exception e) {
			System.err.println(e);
		}
		
		finally {
			sc.close();
			System.out.println("finally block ...");
		}

	}
}
