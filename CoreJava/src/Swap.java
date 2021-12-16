
public class Swap {

	public void swap(int a, int b) {
		int temp;

		System.out.println("\nswap program");
		System.out.println("a is "+a+" b is "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap");
		System.out.println("a is "+a+" b is "+b);
	}

	public static void main(String[] args) {
	 Swap swap=new Swap();
	 swap.swap(1, 2);
	 swap.swap(10, 20);
	  
	}
	
}
