import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int roll;
		String name;
		String subject1,subject2;
		float marks1, marks2;
		float total, avg;
		
		System.out.println("Enter roll");
		roll=sc.nextInt();
		
		System.out.println("Enter name");
		sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter subject1");
		subject1=sc.next();
		
		System.out.println("Enter marks of subject1");
		marks1=sc.nextFloat();
		
		
		System.out.println("Enter subject2");
		subject2=sc.next();
		
		System.out.println("Enter marks of subject2");
		marks2=sc.nextFloat();
		
		total=marks1+marks2;
		avg=total/2;
		
		System.out.println("roll is " + roll);
		System.out.println("name is " + name);
		System.out.println("subject1 is " + subject1);
		System.out.println("marks in subject1 is " + marks1);
		System.out.println("subject2 is " + subject2);
		System.out.println("marks in subject2 is " + marks2);

		System.out.println("\n\tTotal marks is " + total);
		System.out.println("\n\t percentage of marks is " + avg);
	}
}
