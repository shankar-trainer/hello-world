public class Student {

	static String calculateGrade(float m1, float m2, float m3, float m4) {

		float avg = (m1 + m2 + m3 + m4) / 4;

		if (avg >= 75 && avg <= 100)
			return "Distinction";

		if (avg >= 60 && avg <= 74)
			return "First";

		if (avg >= 50 && avg <= 59)
			return "Second";

		if (avg >= 35 && avg <= 49)
			return "Third";

		if (avg >= 0 && avg <= 34)
			return "Fail";

		if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35)
			return "Fail";

		return null;

	}

	static String calculateGrade1(float m1, float m2, float m3, float m4) {
		
		float avg = (m1 + m2 + m3 + m4) / 4;
		if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35)
			return "Fail";
		
		else if (avg >= 75 && avg <= 100)
			return "Distinction";
		
		else if (avg >= 60 )
			return "First";
		
		else 	if (avg >= 50 )
			return "Second";
		
		else if (avg >= 35 )
			return "Third";
		
		else 	
			return "Fail";
	}

	static void display(String nm, int rl, float m1, float m2, float m3, float m4, String s1, String s2, String s3,
			String s4, float av, float tot, String gr) {

		System.out.println("******* \t Student Detail *********\n ");
		System.out.println("\tRoll is : " + rl);
		System.out.println("\tName is : " + nm);

		System.out.println("\n\tSubject1 is : " + s1);
		System.out.println("\tSubject1 Marks  is : " + m1);

		System.out.println("\n\tSubject2 is : " + s2);
		System.out.println("\tSubject2 Marks  is : " + m2);

		System.out.println("\n\tSubject3 is : " + s3);
		System.out.println("Subject3 Marks  is : " + m3);

		System.out.println("\n\tSubject4 is : " + s4);
		System.out.println("Subject4 Marks  is : " + m4);

		System.out.println("Total Marks is : " + tot);
		System.out.println("Average Marks is : " + av);
		System.out.println("Grade   is : " + gr);
	}

}
