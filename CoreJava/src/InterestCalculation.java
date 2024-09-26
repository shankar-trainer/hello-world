
public class InterestCalculation {

	public static void main(String[] args) {
		
		System.out.println("interest Application");
         int time = 5;// local variable inside method 
         float rate=5.6F;// all decimal literal are by default double  
         float amount=12000.500f;
         
         float interest=amount*rate*time/100;
         
         System.out.println("amount   is "+amount);
         System.out.println("time  is "+time);
         System.out.println("rate  is "+rate);
         System.out.println("interest  is "+interest);
         
         System.out.println("==========================");
         
         System.out.println("amount   is "+amount+"\ntime  is "+time+"\nrate is "+rate+"\ninterest is "+interest);
       
         System.out.printf("\namount is %.2f\ntime is %d\nrate is %.2f\ninterest is %.2f",amount,time,rate,interest);
         
	}
}
