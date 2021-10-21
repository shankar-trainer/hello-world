import java.util.Scanner;
public class Program1 {

	
	static int  addition(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no");
		int x=sc.nextInt();
		
		System.out.println("Enter 2nd no");
		int y=sc.nextInt();
	
	   int sum=addition(x,y);
	   
	   System.out.println("sum is "+sum);
	   sc.close();
	}
	
}
