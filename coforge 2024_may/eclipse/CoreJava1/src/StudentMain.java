
public class StudentMain {

	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String name;
		int roll;
		float m1;
		float m2;
		float m3;
		float m4;
		String sub1;
		String sub2;
		String sub3;
		String sub4;
		float avg;
		float total;
		String grade;
		
		System.out.println("Enter roll");
		roll=sc.nextInt();
		
		System.out.println("Enter name");
		sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter  four subjects");
		sub1=sc.next();
		sub2=sc.next();
		sub3=sc.next();
		sub4=sc.next();
		
		System.out.println("Enter  four subject marks");
		
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
		m4=sc.nextFloat();
		
		total=m1+m2+m3+m4;
		avg=total/4;
		
		grade=Student.calculateGrade(m1, m2, m3, m4);
		
		Student.display(name, roll, m1, m2, m3, m4, sub1, sub2, sub3, sub4, avg, total, grade);
	}
}
