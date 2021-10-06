package com.capegemini.io;

public class PasswordValidation {
/*- Must contain at least one digit
- Must contain at least one of the following special characters @, #, $
# Length should be between 6 to 20 characters.
 * 
 */
	
	public static void main(String[] args) {
		
		String pass="hlo1@";
		if((pass.length()>=6 && pass.length()<=20) && 
				pass.matches(".*[\\d]+.*") &&
			pass.matches(".*[@#$]{1}.*"))
		{
			System.out.println("valid");
		}
		else
			System.out.println("not valid");
		
	}
}
