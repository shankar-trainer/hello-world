package ogg.capg.main;

import org.capg.model.Passenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerMain {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("application.xml");
		  Passenger bean = ctx.getBean("passenger1", Passenger.class);
		  
		  System.out.println(bean.getPassengerId());
		  System.out.println(bean.getPassengerName());
		  System.out.println(bean.getPassengerEmail());
		  
		  System.out.println("city list ");
		  System.out.println(bean.getCityList());
		  
		  System.out.println("state list ");
		  System.out.println(bean.getStateSet());
		  
		  System.out.println("country capital");
		  System.out.println(bean.getCountrycapital());
		  
		  System.out.println("city ticket ");
		  System.out.println(bean.getCityTicket());
	}
}
