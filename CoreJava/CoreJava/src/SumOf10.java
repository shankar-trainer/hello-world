import java.util.Scanner;

public class SumOf10 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0,n=0;
		for (int i = 1; i <=10; i++) {
			do {
				System.out.println(" Enter No  "+i+"  :  ");
			    n=scanner.nextInt();
			}
			while(n<=0);
			sum=sum+n;
		}
		System.out.println("sum of 10 positive no is "+sum);
	}
}
