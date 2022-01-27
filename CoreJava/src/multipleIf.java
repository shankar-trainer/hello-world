
public class multipleIf {

	public static void main(String[] args) {
		int averageMarks = 67;
		String grade = null;
		if (averageMarks >= 75 && averageMarks <= 100)
			grade = "distinction";

		if (averageMarks >= 60 && averageMarks < 75)
			grade = "first";

		if (averageMarks >= 50 && averageMarks <= 59)
			grade = "second";

		if (averageMarks >= 35 && averageMarks < 50)
			grade = "third";

		if (averageMarks >= 0 && averageMarks < 35)
			grade = "fail";
		System.out.println("grade is " + grade);

		System.out.println("=== nested if ");

		if (averageMarks >= 75 && averageMarks <= 100)
			grade = "distinction";

		else if (averageMarks >= 60)
			grade = "first";

		else if (averageMarks >= 50)
			grade = "second";

		else if (averageMarks >= 35)
			grade = "third";

		else
			grade = "fail";
		System.out.println("grade is " + grade);

	}
}
