package com.audintel.error;

public class ExceptionProgram2 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		try {
			System.out.println("Result " + 1 / 0);

		} catch (Exception e) {
			System.out.println("some problem " + e.getMessage());
			System.err.println("..some problem " + e.getMessage());
		}

		try {
			int arr[] = { 11, 22, 33, 44 };
			System.out.println(arr[2]);
			String s=null;
			System.out.println(s.length());
		} 
		
		catch (NullPointerException e) {
			System.out.println("null error  ");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index error   ");
		}
		
		catch (Exception e) {
			System.out.println("some problem.. " + e.getMessage());
		}
		
		
		System.out.println("program ends ");
	}
}
