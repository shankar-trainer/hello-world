class ContinuePrg1{
	
  public static void main(String args[]){

	java.util.Scanner sc=new java.util.Scanner(System.in);
   
    int count=1, sum=0, n=0;

     while(count<=10)	
	 {
		System.out.println(count +": Enter even no");
		
		n=sc.nextInt();
		if(n%2!=0)
			continue;
		sum=sum+n;
		count++;
	 }
	 System.out.println("sum is "+sum);
   }	
}