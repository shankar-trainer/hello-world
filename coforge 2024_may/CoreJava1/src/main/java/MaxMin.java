
public class MaxMin {
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		
		int counter=1;
		int sum=0; 
		int n=0, max=0,min=0;
		
		while (counter<=10) {
			System.out.println("Enter no ");
		    n=sc.nextInt();
		    if(counter==1)
		    	max=min=n;
		    else if(n>=max)
		    	max=n;
		    else if(n<=min)
		    	min=n;
		    
		    sum=sum+n;
		    counter++;
		}
		
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		System.out.println("sum is "+sum);
	}
}

/*

Question

Make class MaxMin
   take 10 number from user and display sum , max and min 

   use while loop 
*/
   



