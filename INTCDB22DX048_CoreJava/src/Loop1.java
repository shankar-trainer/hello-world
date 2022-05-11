
public class Loop1 {

	public static void main(String[] args) {
		int counter=1;
		int sum=0;
		while(counter<=10) {
			System.out.println(counter);
			sum=sum+counter;
			counter=counter+1;
		}
		
		System.out.println("sum of 1 .. 10 is "+sum);
	}
}
