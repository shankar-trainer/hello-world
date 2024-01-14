package com.coforge.exception;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		System.out.println("program starts ");

		int ar[] = { 1, 2, 3, 4, 5 };
		String name = "ram kumar";
		String s = null;

		try {
			System.out.println(s.length());
			System.out.println("fifth element is " + ar[5]);
			// ArrayIndexOutOfBoundsException

			System.out.println(name);
			System.out.println(name.charAt(9));
			// StringIndexOutOfBoundsException
		}

		catch (NullPointerException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

//		catch (NullPointerException e) {
//			 System.err.println(e.getMessage());
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			 System.err.println(e.getMessage());
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			 System.err.println(e.getMessage());
//		}

		
		System.out.println("program ends ");

	}

}
