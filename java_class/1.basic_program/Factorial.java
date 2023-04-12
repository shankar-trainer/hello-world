class Factorial{
	
	static long getFactorial(int m){
     long fact=1;	 
	 for(int x=1;x<=m;x++)
		   fact=fact*x;
	 return fact;  
	} 
	
	static long getFactorial2(int m){
     long fact=1;	 
	 for(int x=m;x>=1;x--)
		   fact=fact*x;
	 return fact;  
	} 
	
	public static void main(String args[]){
		java.util.Scanner sc=new java.util.Scanner(System.in);
    
	    System.out.println("Enter no for the factorial ");
		int p=sc.nextInt();
		long res=getFactorial2(p);
	    System.out.println("Factorial of "+p+" is "+res);
			
	}
}