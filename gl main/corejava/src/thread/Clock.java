package thread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		
		Date date=null;
		int x=1;
		//while(true)
		while(x<=100)
		{	
			Thread.sleep(1000);
			
			date=new Date();
	System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());		
		x++;
		}
		
	}
}
