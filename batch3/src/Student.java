import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int roll;
		String name, subject1, subject2,designation;
		float marks1, marks2, total, avg;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter roll ");
		roll=scanner.nextInt();
		
		System.out.println("Enter name ");
		name=scanner.next();
		
		System.out.println("Enter subject1 ");
		subject1=scanner.next();
		
		System.out.println("Enter subject2 ");
		subject2=scanner.next();
		
		System.out.println("Enter marks1 ");
		marks1=scanner.nextFloat();
		
		System.out.println("Enter marks2 ");
		marks2=scanner.nextFloat();
		
		total=marks1+marks2;
		avg=total/2;
		
		if(avg>=75 && avg<=100)
			 designation="distinction";
		else if(avg>=60)
		     designation="first";
		
		else if(avg>=50)
			designation="second";
		else
			designation="fail";
		
		System.out.println("Student record");
		System.out.println("roll is "+roll);
		System.out.println("name is "+name);
		System.out.println("subject1 is "+subject1);
		System.out.println("marks1 is "+marks1);
		
		System.out.println("subject2 is "+subject2);
		System.out.println("marks2 is "+marks2);
		
		System.out.println("total marks  is "+total);
		System.out.println("average marks is "+avg);
		System.out.println("designation is "+designation);
		
	}
}
