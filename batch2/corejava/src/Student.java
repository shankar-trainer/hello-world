import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		int roll;
		String name, subject1, subject2, designation;
		
		float marks1,marks2,total,avg;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll no ");
		roll=sc.nextInt();
		
		System.out.println("Enter Name");
		name=sc.next();
		
		System.out.println("Enter Subject1");
		subject1=sc.next();
		
		System.out.println("Enter Subject2");
		subject2=sc.next();
		
		System.out.println("Enter Marks1");
		marks1=sc.nextFloat();
		
		System.out.println("Enter Marks2");
		marks2=sc.nextFloat();
		
		total=marks1+marks2;
		avg=total/2;

		if(avg>=75 && avg<=100 )  
			designation="distinction";
		else if(avg>=60)
			designation="first";
		
		else if(avg>=50)
			designation="second";
		
		else if(avg>=34)
			designation="third";
		else 
			designation="fail";
			
		System.out.println("Student Record");
		System.out.println("Roll is "+roll);
		System.out.println("Name is "+name);
		System.out.println("Subject1 is "+subject1);
		System.out.println("Subject2 is "+subject2);
		System.out.println("Marks1 is "+marks1);
		System.out.println("Marks2 is "+marks2);
		
		System.out.println("total marks  "+total);
		System.out.println("average marks  "+avg);
		System.out.println("\ndesignation  "+designation);
		
		
		
	}
}
