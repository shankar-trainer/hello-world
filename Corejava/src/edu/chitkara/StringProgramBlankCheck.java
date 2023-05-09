package edu.chitkara;

public class StringProgramBlankCheck {

	public static void main(String[] args) {
		
		String name="   ";
		if(name.length()==0)
			System.out.println("name is blank");
		
		if(name.isEmpty()) {                    // isEmpty -- 1.6
			System.out.println("name is empty");
		}
		
		if(name.isBlank()) { //isBlank -- blank, whitespace
			System.out.println("name isBlank..");
		}
		
		
	}
}
