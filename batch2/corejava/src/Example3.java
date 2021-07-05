import java.util.Scanner;

public class Example3 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the country name ");

		String country=sc.next();
		
		switch (country) {
		case "india":
			  System.out.println("capital of  "+country+" is new delhi");
			break;
			
		case "srilanka":
			System.out.println("capital of  "+country+" is new colombo");
			break;
			
		case "nepal":
			System.out.println("capital of  "+country+" is new kathmandu");
			break;
			
		case "dhaka":
			System.out.println("capital of  "+country+" isdhaka");
			break;

		default:
			System.out.println("country name not present");
			break;
		}
		sc.close();
	}
}
