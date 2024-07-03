
public class Loop1 {

	public static void main(String[] args) {
		
		int counter=1;
		int sum=0; 
		
		while (counter<=10) {
			
//			System.out.println(counter);
			System.out.print(counter+",  ");
			sum=sum+counter;
			counter=counter+1;
		}
		System.out.println("\n\nsum of 1 to 10 is "+sum);
	}
}
