
public class Student {

	public static void main(String[] args) {
		int roll=8778;
		String grade = null;
		String name="ram kumar";
		String subject1="math";
		String subject2="science";
		float marks1=78.566f;
		float marks2=88.566f;
		float totalMarks=marks1+marks2;
		float averageMarks=totalMarks/2;
		
		System.out.println("Roll is "+roll);
		System.out.println("Name is "+name);
		System.out.println("Subject1 is "+subject1);
		System.out.println("Subject2 is "+subject2);
		System.out.println("Marks of subject1 is "+marks1);
		System.out.println("Marks of subject2 is "+marks2);
		System.out.println("Total Marks "+totalMarks);
		System.out.println("Average Marks "+averageMarks);

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
