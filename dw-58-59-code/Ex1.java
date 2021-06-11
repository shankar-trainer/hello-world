import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int x, y, z;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st no");
		x=scanner.nextInt();

		System.out.println("Enter 2nd no");
		y=scanner.nextInt();
		
		z=x+y;
		
		System.out.println("no1 is "+x+"\nno2 is "+y);
		System.out.println("sum  "+z);
		
	}
}
