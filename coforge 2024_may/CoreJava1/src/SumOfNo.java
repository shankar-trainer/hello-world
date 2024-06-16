
public class SumOfNo {

	static int sum() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String ch="y";
		int n,sum=0;
		
		do {
			
			System.out.println("enter no ");
			n=sc.nextInt();
			sum=sum+n;
			System.out.println("continue y\\n");
			ch=sc.next();
			
		}while(ch.equals("y"));
		
		return sum;

	}
	
	public static void main(String[] args) {
      System.out.println("sum is "+sum());		
	}
	
}
