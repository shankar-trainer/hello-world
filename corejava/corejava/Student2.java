public class Student2 {

	static void studentInfo(int roll, String name, String subject1, String subject2, float marks1, float marks2, float total, float avg){

		System.out.println("\t\t**** student data ***** ");
		System.out.println("\t\t\troll is :"+roll);
		System.out.println("\t\t\tname is :"+name);
		System.out.println("\t\t\tsubject1 is :"+subject1);
		System.out.println("\t\t\tsubject2 is :"+subject2);
		System.out.println("\t\t\tmarks1 is :"+marks1);
		System.out.println("\t\t\tmarks2 is :"+marks2);
		System.out.println("\t\t\ttotal marks is :"+total);
		System.out.println("\t\t\taverage marks is :"+avg);
		
		String grade=null;
		if(avg>=75 && avg<=100)
			grade="distinction";
		else if(avg<75)
			grade="first";
		
		else if(avg<60)
			grade="second";
		
		else if(avg<50)
			grade="third";
		
		else if(avg<35)
			grade="fail";
		
		if(marks1<35 || marks2<35)
			grade="fail";
		
		System.out.println("\n\t\t\tgrade is "+grade);
	}
	
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		int roll;
		String name;
		String subject1,subject2 ;
		float marks1,marks2, total, avg;
		
		System.out.println("enter roll");
		roll=sc.nextInt();
		
		System.out.println("enter name");
		name=sc.next();
		
		System.out.println("enter two subjects  name");
		subject1=sc.next();
		subject2=sc.next();
		
		System.out.println("enter two subjects  marks ");
		marks1=sc.nextFloat();
		marks2=sc.nextFloat();
		
		total=marks1+marks1;
		avg=total/2;
		
		studentInfo(roll, name, subject1, subject2, marks1, marks2, total, avg);
		
		sc.close();
	}
}
