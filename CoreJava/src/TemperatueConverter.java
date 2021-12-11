import java.util.Scanner;

public class TemperatueConverter {

	public static void main(String[] args) {
		System.out.println("Enter temperature in celsius ");
		float celsius_temp=new Scanner(System.in).nextFloat();
		
		float fahrenheit=celsius_temp*9/5+32;
		System.out.println("Temperature in celsius is "+celsius_temp);
		System.out.println("Temperature in fahrenheit is "+fahrenheit);
		
	}
}
