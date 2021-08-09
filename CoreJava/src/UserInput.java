import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		int roll;
		String name, subject1, subject2;
		float marks1, marks2, total, average;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter roll");
		roll = sc.nextInt();

		System.out.println("Enter name");
		// name=sc.next();
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Enter subject1");
		subject1 = sc.next();

		System.out.println("Enter subject2");
		subject2 = sc.next();

		System.out.println("Enter marks1");
		marks1 = sc.nextFloat();

		System.out.println("Enter marks2");
		marks2 = sc.nextFloat();

		total = marks1 + marks2;
		average = total / 2;

		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("subject1 is " + subject1);
		System.out.println("subject2 is " + subject2);
		System.out.println("marks1 is " + marks1);
		System.out.println("marks2 is " + marks2);
		System.out.println("total marks  is " + total);
		System.out.println("average marks  is " + average);

	}
}
