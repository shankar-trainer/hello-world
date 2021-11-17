
public class Studentmarks2 {

	public static void main(String[] args) {
		int roll = 10001;
		String name = "ram kumar";
		String subject1 = "mathmetic";
		float marks1 = 89.56f;
		String subject2 = "science";
		float marks2 = 80.56f;

		float total = marks1 + marks2;
		float percentage = total / 2;

		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("subject1 is " + subject1);
		System.out.println("marks in subject1 is " + marks1);
		System.out.println("subject2 is " + subject2);
		System.out.println("marks in subject2 is " + marks2);

		System.out.println("\n\tTotal marks is " + total);
		System.out.println("\n\t percentage of marks is " + percentage);

		if (percentage >= 75 && percentage <= 100)
			System.out.println("grade is distinction");

		else if (percentage >= 60)
			System.out.println("grade is first");

		else if (percentage >= 50 )
			System.out.println("grade is second");

		else if (percentage >= 35)
			System.out.println("grade is third");
		else 
			System.out.println("fail");

	}

}
