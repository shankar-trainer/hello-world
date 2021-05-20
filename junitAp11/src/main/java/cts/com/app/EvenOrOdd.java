package cts.com.app;

public class EvenOrOdd {

	public boolean evenCheck(long n) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return n%2==0;		
	}
	
	public boolean oddCheck(long n) {
		return n%2!=0;		
	}
	
	int factorial(int p) {
		int k=1;
		for (int i = 1; i <=p; i++) {
			k=k*i;
		}
		return k;
	}
	
	
	
}
