package com.capegemini.io;

public class regex_hexCode {

	public static void main(String[] args) {
		String s="#345ADF";
		
		System.out.println(s.matches("#[a-fA-F0-9]{6}"));
		
		//String id="abes_122344";
		String id="helloabes_122344";
		
		System.out.println(id.matches("^abes.*"));
		
		
		
		
		
	}
}
