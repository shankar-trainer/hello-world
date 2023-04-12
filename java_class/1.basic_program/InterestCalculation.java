class InterestCalculation{
	static float interest(float amount,float rate, int t){
		return amount*rate*t/100;
	}
	
	
 public static void main(String args[]){
	
	java.util.Scanner sc=new java.util.Scanner(System.in);
    
    System.out.println("Enter amount rate and time");
    float amt=sc.nextFloat();
    int rate=sc.nextInt();
    int time=sc.nextInt();
	
	float i=interest(amt,rate,time);
	System.out.println("interest is "+i);
		
	}
	
	
}