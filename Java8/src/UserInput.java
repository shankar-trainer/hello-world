import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		  double d1=78787.888;// deciaml is by default double 62 bit
		 float d2=78787.888F;

		Scanner scanner = new Scanner(System.in);

		String name, subject1, subject2;
		int roll;
		int m1, m2;
		int total;
		float avg;

		System.out.println("Enter name");
		name = scanner.nextLine();

		System.out.println("Enter roll");
		roll = scanner.nextInt();

		System.out.println("Enter subject1");
		subject1 = scanner.next();

		System.out.println("Enter subject2");
		subject2 = scanner.next();

		System.out.println("Enter marks of subject1");
		m1 = scanner.nextInt();

		System.out.println("Enter marks of subject2");
		m2 = scanner.nextInt();

		total = m1 + m2;
		avg = total / 2;

		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("subject1 is " + subject1);
		System.out.println("subject2 is " + subject2);
		System.out.println("marks1 is " + m1);
		System.out.println("marks2 is " + m2);
		System.out.println("total is " + total);
		System.out.println("percentage is " + avg);

		scanner.close();

	}
}
