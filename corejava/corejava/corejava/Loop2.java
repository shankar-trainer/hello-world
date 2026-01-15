package corejava;

public class Loop2 {

	public static void main(String[] args) {
		
		int n=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		do {
			System.out.println("enter even number");
			n=sc.nextInt();
		}
		while(n%2!=0);

		System.out.println("no is "+n);
		
	}
}
