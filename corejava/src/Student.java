
public class Student {

	public static void main(String[] args) {
		
		int roll=10001;
		String name="suresh kumar";
		String subject1="math";
		String subject2="science", subject3="english";
		
		float m1=56.5f;
		//double m1=55.6;
		float m2=66.4F,m3=85.6f;
		
		float total=m1+m2+m3;
		float percentage=total/3;
		
		System.out.println("Student Information");
		System.out.println("\tRoll is "+roll);
		System.out.println("\tName is "+name);
		System.out.println("\tSubject1 is "+subject1);
		System.out.println("\tSubject2 is "+subject2);
		System.out.println("\tSubject3 is "+subject3);
		
		System.out.println("\n\tTotal marks is "+total);
		System.out.println("\tPercentage marks is "+percentage);
		
		
	}
}
