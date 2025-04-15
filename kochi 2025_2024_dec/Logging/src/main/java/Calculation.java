import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculation {

 static Logger logger=LogManager.getLogger(Calculation.class);
	
	public static void main(String[] args) {
		
		int x,y;
		Scanner scanner=new Scanner(System.in);
		try{	
			
		System.out.println("Enter First no");
		x=scanner.nextInt();
		
		if(x<0)
			logger.debug("no1 is less than zero");
		else 
			logger.info("no1 is valid");

		System.out.println("Enter Second no");
		y=scanner.nextInt();
		
		if(y<0)
			logger.warn("no2 is less than zero");
		else 
			logger.info("no2 is valid");
		
	    	 System.out.println("Addition is "+(x+y));
		 System.out.println("Division  is "+(x/y));
	    }
	    catch (InputMismatchException e) {
			logger.error("format error  input must be number  ");
		}
	    
	    
	}
}
