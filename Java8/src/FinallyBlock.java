import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner sc=null;
		
		try {
			sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int x=sc.nextInt();
		
		System.out.println("Enter second number ");
		int y=sc.nextInt();
		
		System.out.println(x/y);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("finally called ");
			sc.close();
		}
		
		
	}
}
