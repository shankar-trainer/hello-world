import java.util.Scanner;

public class LoopPrg1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no ");
		int x=scanner.nextInt();
		int counter=1; 
		
		while (counter<=10) {
			System.out.println(counter*x);
			counter++;
		}
		
		String ch="y";
		
		int sum=0;
		while(ch.equals("y")) {
			System.out.println("Enter a no");
			x=scanner.nextInt();
			sum=sum+x;
			System.out.println("continue y\\n");
			ch=scanner.next();
		}
		System.out.println("sum is "+sum);
		scanner.close();
	}
}
