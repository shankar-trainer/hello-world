
public class SumOfDigit {

	static int  sum(int n) {
		int s=0,p=0;
		while(n!=0) {
			p=n%10;      //123%10=
			s=s+p;
			n=n/10;
			}
	return s;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int p,res;
		p=sc.nextInt();
		res=sum(p);
		System.out.println("sum is "+res);
		
		p=sc.nextInt();
		System.out.println("sum is "+(sum(p)));
		sc.close();
	}
	
}
