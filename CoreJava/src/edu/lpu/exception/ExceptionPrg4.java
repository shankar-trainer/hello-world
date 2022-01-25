package edu.lpu.exception;

import java.util.Scanner;

public class ExceptionPrg4 {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
	//	  String s="123a";	
		  String s="123";	
		  int roll=Integer.parseInt(s);
		  System.out.println("roll is "+roll);
		}
		catch (NumberFormatException e) {
			//System.out.println(e);
			System.err.println("error is "+e);
		}
		catch (Exception e) {
		 System.err.println("error ");
		}
		
		finally {
		  sc.close();
			System.out.println("finally block");	
		}
	}
}
