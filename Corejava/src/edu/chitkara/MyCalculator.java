package edu.chitkara;

import java.util.Scanner;

public class MyCalculator  implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
	System.out.println("I implemented:"+this.getClass().getInterfaces()[0].getSimpleName());
		int sum=0; 
		for (int i = 1; i <=n; i++) {
		     if(n%i==0)
			sum=sum+i;	
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		MyCalculator myCalculator = new MyCalculator();
		System.out.println(myCalculator.divisor_sum(scanner.nextInt()));		
        scanner.close();
	}
}
