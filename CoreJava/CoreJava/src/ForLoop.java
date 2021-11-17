
public class ForLoop {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i = 1; i <=100; i++) {
			sum=sum+i;
		}
		
		System.out.println("sum is "+sum);
		
		int x=1;
		
		for(;x<=10;) {
			System.out.println("9 * "+x+" = "+(9*x));
			x++;
		}
		
		for(int p=1,q=10;p<=10;p++) {
			System.out.println(p+"    "+q);
			q=q+10;
		}
		
	}
}
