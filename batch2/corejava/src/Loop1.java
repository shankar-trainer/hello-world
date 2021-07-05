
public class Loop1 {

	public static void main(String[] args) {
		
		int c=1;
		while(c<=10)
			System.out.println(c++);
		
		System.out.println("sum of 1 to 10 ");
		
		int sum=0;
		c=1;
		while(c<=10) {
		sum=sum+(c++);
		}
		System.out.println("sum is "+sum);
	}
}
