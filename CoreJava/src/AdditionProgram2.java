import java.util.Scanner;

public class AdditionProgram2 {

	public static void main(String[] args) {
		int x,y;
		int z;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no1");
		x=scanner.nextInt();
		
		System.out.println("Enter no2");
		y=scanner.nextInt();
		z=x+y;
		
		System.out.println("no1 is "+x);
		System.out.println("no2 is "+y);
		System.out.println("sum is "+z);
		scanner.close();
	}
}
