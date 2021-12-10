
public class Program1 {

	public static void main(String[] args) {
		int x=10;
		
		System.out.println("even "+(x%2==0));
		System.out.println("odd "+(x%2!=0));
		
		if(x%2==0)
			System.out.println(x+" is even");
		
		if(x%2!=0)
			System.out.println(x+" is odd");
		
	}
}
