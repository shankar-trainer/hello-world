
public class Student {

	public static void main(String[] args) {
		String name="suman kumar";
		int roll=8787;
		int m1=78,m2=67;
		int total=m1+m2;
		float avg=total/2;
		
		System.out.println("student information" );
		System.out.println("roll is "+roll);
		System.out.println("name is "+name);
		System.out.println("marks1 is "+m1);
		System.out.println("marks2 is "+m2);
		System.out.println("total marks is "+total);
		System.out.println("percentage   is "+avg);
		
		System.out.println();
		
		if(avg>=75 && avg<=100)
			 System.out.println("grade is distinction");

		if(avg>=60 && avg<=74)
			System.out.println("grade is  first");
		
		if(avg>=50 && avg<=59)
			System.out.println("grade is second");
		
		if(avg>=35 && avg<=49)
			System.out.println("third");
		
		if(avg>=0 && avg<=34)
			System.out.println("fail");
		
	}
}
