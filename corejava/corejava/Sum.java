
public class Sum {

	 static void  sum() {
	        int c=1;
	        int sum=0;
	        java.util.Scanner sc=new java.util.Scanner(System.in);
	        int n=0;
	        
	        while(c<=10) {
	        	 System.out.println("enter number");
	        	 n=sc.nextInt();
	        	 sum=sum+n;
	        	 c=c+1;
	        }
	        
	        System.out.println("sum is "+sum);
	        sc.close();
	 }
	 
	 public static void main(String[] args) {
		sum();
	}
}
