package edu.chitkara;

import java.util.Scanner;

public class MyCalculator  implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		System.out.println("I implemented:"+getClass().getSimpleName());
		int sum=0; 
		for (int i = 1; i <=n; i++) {
		     if(n%i==0)
			sum=sum+i;	
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(new MyCalculator().divisor_sum(scanner.nextInt()));		
        scanner.close();
	}
}
