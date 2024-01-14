
public class StudentPerformance {

	static String gradeCalculation(float percentage, float m1, float m2, float m3) {
		String grade = null;
		if (percentage >= 75 && percentage <= 100)
			grade = "distinction";

		else if (percentage >= 60)
			grade = "first";

		else if (percentage >= 50)
			grade = "second";

		else if (percentage >= 35)
			grade = "third";

		else if (percentage >= 0)
			grade = "fail";

		if (m1 < 35 || m2 < 35 || m3 < 35)
			grade = "fail";

		return grade;
	}

	static void display(int r, String nm, String s1, String s2, String s3, float m1, float m2, float m3, float t,
			float p, String g) {
		System.out.println("Student Information");

		System.out.println("\t\tRoll :" + r);
		System.out.println("\t\tName :" + nm);
		System.out.println("\t\tSubject1 :" + s1);
		System.out.println("\t\tSubject2 :" + s2);
		System.out.println("\t\tSubject3 :" + s3);
		System.out.println("\t\tMarks1 :" + m1);
		System.out.println("\t\tMarks2 :" + m2);
		System.out.println("\t\tMarks3 :" + m3);
		System.out.println("\t\tTotal :" + t);
		System.out.println("\t\tPercentage :" + p);
		System.out.println("\t\tGrade :" + g);
	}

	public static void main(String[] args) {
		int roll;
		String name, subject1, subject2, subject3;
		float marks1, marks2, marks3, total, percentage;
		String grade;

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter roll");
		roll = sc.nextInt();

		System.out.println("Enter Name");
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Enter Subject1");
		subject1 = sc.next();

		System.out.println("Enter Subject2");
		subject2 = sc.next();

		System.out.println("Enter Subject3");
		subject3 = sc.next();

		System.out.println("Enter Marks1");
		marks1 = sc.nextInt();

		System.out.println("Enter Marks2");
		marks2 = sc.nextInt();

		System.out.println("Enter Marks3");
		marks3 = sc.nextInt();

		total = marks1 + marks2 + marks3;

		percentage = total / 3;

		grade = gradeCalculation(percentage, marks1, marks2, marks3);
		display(roll, name, subject1, subject2, subject3, marks1, marks2, marks3, total, percentage, grade);
		

	}

}
