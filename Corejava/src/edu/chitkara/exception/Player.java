package edu.chitkara.exception;

import java.util.Scanner;

class CustomException extends Exception {
	public CustomException(String s) {
		super(s);
	}
}

public class Player {
	String name;
	int age;

	public static void main(String[] args) {
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the player name");
		player.name = scanner.nextLine();
		
		System.out.println("Enter the player age");
		player.age = scanner.nextInt();
		try {
		if(player.age<19)
			throw new CustomException("InvalidAgeRangeException");
		else {
			System.out.println("Player name : "+player.name);
			System.out.println("Player age : "+player.age);
		}
		}
		catch (CustomException e) {
			System.err.println(e.getClass().getSimpleName()+":"+e.getMessage());
		}
				scanner.close();
	}
}
