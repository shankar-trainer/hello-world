import java.util.Scanner;

public class PrimeNo {


	static public boolean checkPrime(int n ) {
		
		int counter=2;
		
		while(counter<=n-1){
		  if(n%counter==0)
			  return false;
		  counter++;
		}
		return true;
	}
	 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		
		System.out.println(x+"  is prime  --"+checkPrime(x));
		
	}
}
