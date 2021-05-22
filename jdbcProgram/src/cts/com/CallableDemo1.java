package cts.com;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class CallableDemo1 {

	
	public static void main(String[] args) {
		Callable<String> callable=()->{
			 return "hello";
		};
		
	

		
	}
	
}
