package com.capegemini;

import java.util.Scanner;

import com.capegemini.exception.VoterException;

public class VoterMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Voter voter = new Voter();
		System.out.println("Enter  voter id between 1000 -  10000");
		try {
			voter.setVoter_id(scanner.nextInt());
			System.out.println("Enter  voter name min 5 chars");
			scanner.nextLine();
			voter.setVoter_name(scanner.nextLine());
			System.out.println("Enter  voter age >=18 Years ");
			voter.setVoter_age(scanner.nextInt());
			System.out.println("\n\nVoter Information ");
			System.out.println("\tVoter Id  " + voter.getVoter_id());
			System.out.println("\tVoter Name  " + voter.getVoter_name());
			System.out.println("\tVoter Age  " + voter.getVoter_age());
		} catch (VoterException e) {
			
			// System.out.println(e.getMessage());
			System.err.println("at main "+e.getMessage());
		}
	}
}
