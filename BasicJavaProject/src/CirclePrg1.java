import java.util.Scanner;

public class CirclePrg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius");
		float radius=sc.nextFloat();
		float area=3.14f*radius*radius;
		float circumference=2*3.14f*radius;
		
		System.out.println("radius is "+radius);
		System.out.println("area is "+area);
		System.out.println("circumference is "+circumference);
		
	
		System.out.println("\n--------\n");
		System.out.println("radius is "+radius+"\narea is "+area+"\ncircumference is "+circumference);

		
	}
}
