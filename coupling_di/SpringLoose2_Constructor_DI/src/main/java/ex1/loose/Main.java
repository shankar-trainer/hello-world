package ex1.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Traveller traveller1 = ctx.getBean("car_traveller", Traveller.class);
	    traveller1.getVehicle().start();
	    
	    Traveller traveller2 = ctx.getBean("bike_traveller", Traveller.class);
	    traveller2.getVehicle().start();
	    
	}
}
