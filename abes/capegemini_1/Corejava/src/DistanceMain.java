import java.util.Scanner;


public class DistanceMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter distance in km");
		
		Distance distance=new Distance(scanner.nextFloat());
		
		distance.convertToFeetInches();
		distance.convertToMeterCentimeter();
		
		System.out.println(distance.getMeter()+"  "+distance.getCentimeter());
		System.out.println(distance.getFeet()+"  "+distance.getInch());
		scanner.close();
	}
}
