import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  no");
		int x = scanner.nextInt();

		//1234/10-- 123
		 //1234%10-- 4
		 int sum=0;
		 
		 while(x!=0) {
			int rem= x%10;
			 sum=sum+rem;
			 x=x/10;
		 }
		 System.out.println(sum);
		
	}
}
