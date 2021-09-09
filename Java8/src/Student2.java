
public class Student2 {

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

		else if(avg>=60)
			System.out.println("grade is  first");
		
		else if(avg>=50)
			System.out.println("grade is second");
		
		else if(avg>=35 )
			System.out.println("third");
		
		else 
			System.out.println("fail");
		
	}
}
