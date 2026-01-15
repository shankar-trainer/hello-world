public class Student {

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
		
		System.out.println("\t\t**** student data ***** ");
		System.out.println("\t\t\troll is :"+roll);
		System.out.println("\t\t\tname is :"+name);
		System.out.println("\t\t\tsubject1 is :"+subject1);
		System.out.println("\t\t\tsubject2 is :"+subject2);
		System.out.println("\t\t\tmarks1 is :"+marks1);
		System.out.println("\t\t\tmarks2 is :"+marks2);
		System.out.println("\t\t\ttotal marks is :"+total);
		System.out.println("\t\t\taverage marks is :"+avg);
		sc.close();
	}
}
