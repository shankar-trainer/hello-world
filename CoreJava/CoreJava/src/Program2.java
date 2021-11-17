import java.util.Scanner;

public class Program2 {

	static void convert_metertoFeetandInch(float distance) {
    // 30cm -- 1 feet 
		float meter_in_cm=distance*100;
	    int feet=(int) (meter_in_cm/30);
		
		int inch=(int) (meter_in_cm%30);
		System.out.println("feet "+feet);
		System.out.println("inch  "+inch);
	}
	
	static void convert_metertoKm(float distance) {
      System.out.println(distance+" meter is "+(distance/1000)+"  km");	  	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int meter, cm;

		System.out.println("Enter meter and centimeter ");
		meter = scanner.nextInt();
		cm = scanner.nextInt();
		
		float distance=meter+(cm/100);
		
		convert_metertoKm(distance);
		convert_metertoFeetandInch(distance);
	}
}
