import java.util.Scanner;

public class continuePrg1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int count=1,no=0,sum=0;
		
		while(count<=10) {
			System.out.println("Enter no   "+count);
			no=scanner.nextInt();
			if(no%2!=0)
				continue;
			
			sum=sum+no;
			count++;
		}
		System.out.println("sum is "+sum);
		
		scanner.close();
		
		
	}
}
