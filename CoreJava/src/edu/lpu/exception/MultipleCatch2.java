package edu.lpu.exception;

public class MultipleCatch2 {

	public static void main(String[] args) {
		/*
		 * System.out.println(10/5); System.out.println(10/6);
		 * System.out.println(10/10); System.out.println(10/11);
		 * System.out.println(10.0/11);
		 */
		try {
//		String n1="123abc";
			String n1 = "123a";
			String p = "hello";
			int n2 = Integer.parseInt(n1);
			System.out.println(n1);
			System.out.println(p.charAt(6));
		} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} 
	}
}
