
public class Student {

	static void display(int r,String n,String s1,float m1,String s2,float m2,
			float t, float a,String g
			) {
		System.out.println("Student details");
		System.out.println("\tRoll "+r);
		System.out.println("\tName "+n);
		System.out.println("\tSubject1  "+s1);
		System.out.println("\tMarks1 "+m1);
		System.out.println("\tSubject2 "+s2);
		System.out.println("\tMarks2  "+m2);
		System.out.println("\tTotal marks "+t);
		System.out.println("\tAverage marks "+a);
		System.out.println("\tGrade   "+g);
	}
	
	
	public static void main(String[] args) {
		int roll;
		String name,subject1,subject2,grade;
		
		float m1,m2,total,avg;
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter roll");
		roll=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		
		System.out.println("Enter subject1");
		subject1=sc.next();
		
		System.out.println("Enter marks1");
		m1=sc.nextFloat();
		
		System.out.println("Enter subject2");
		subject2=sc.next();
		
		System.out.println("Enter marks2");
		m2=sc.nextFloat();
		
		total=m1+m2;
		avg=total/2;
		if(m1<35 || m2<35)
			grade="fail";

		else if(avg>=75 && avg<=100)
			grade="distinction";
		
		else if(avg>=60 && avg<75)
			grade="A";
		
		else if(avg>=50 && avg<59)
			grade="B";
		
		else if(avg>=35 && avg<50)
			grade="C";
		else
			grade="fail";
		
		display(roll, name, subject1, m1, subject2, m2, total, avg, grade);
		
	}
}
