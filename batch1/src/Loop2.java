import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number ");
		int p=scanner.nextInt();
		int fact=1;
		int c=1;
		while(c<=p) {
			fact=fact*c;
			c++;
		}
		System.out.println("factorail of "+p+" is "+fact);
		scanner.close();
	}
}
