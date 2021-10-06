package exception;

import java.util.Scanner;

public class Server {

	
	void divide(int a, int b) throws Exception{
		
		if(b==0)
			try {
				throw new Exception("denominator is zero");
			} catch (Exception e) {
			   System.err.println("at server error is "+e.getMessage());
			   throw e;
			}
		else
			System.out.println("Division is "+(a/b));
		
	}
	
	
	
}
