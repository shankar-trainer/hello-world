package corejava;

import java.util.Random;

public class RandEx {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		System.out.println(random.nextInt());
		  // randome int 
		
		System.out.println(random.nextFloat());
		// 0.0  1.0
		
		System.out.println(random.nextInt(10));
		  // 0 -9 
		
		int max=100;
		int min =10;
		
		System.out.println(random.nextInt(max-min+1)+min);
		// 10 - 100
		
		
	}
}
