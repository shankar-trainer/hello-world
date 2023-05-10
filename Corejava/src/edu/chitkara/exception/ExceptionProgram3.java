package edu.chitkara.exception;

public class ExceptionProgram3 {
	public static void main(String[] args) {

		String name = null;
		String language = "java";
                 //multiple try and multiple catch 
		try {
			System.out.println("name is " + name);
		System.out.println("name length is " + name.length());
		}
		catch (NullPointerException e) {
			System.err.println("null exception");
		}
		
		try {
			System.out.println("language is " + language);
System.out.println("language 5th char is  " + language.charAt(4));
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("some error ");
			e.printStackTrace();
		}
		 finally {
			System.out.println(); 
		 }

	}
}
