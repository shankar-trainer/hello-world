
public class Student {

	public static void main(String[] args) {
		int roll = 887;
		String name = "suresh kumar";
		String subject1 = "math", subject2 = "science";
		float marks1 = 67, marks2 = 89.4f;

		float total = marks1 + marks2;
		float percentage = total / 2;

		char grade='0';
		if (percentage >= 75 && percentage <= 100)
			grade = 'A';

		if (percentage >= 60 && percentage <= 74)
			grade = 'B';

		if (percentage >= 50 && percentage <= 59)
			grade = 'C';

		if (percentage >= 35 && percentage <= 49)
			grade = 'D';

		if (percentage >= 0 && total <= 34)
			grade = 'E';
		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("subject1 is " + subject1);
		System.out.println("marks1 is " + marks1);
		System.out.println("subject2 is " + subject2);
		System.out.println("marks2 is " + marks2);
		System.out.println("total is " + total);
		System.out.println("percentage is " + percentage);
		System.out.println("grade is " + grade);

	}
}
