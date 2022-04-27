package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Driver;
import com.cognizant.model.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {

		// ApplicationContext ctx
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Vehicle bean = ctx.getBean("vehicle1", Vehicle.class);
		System.out.println("id is " + bean.getId());
		System.out.println("model is " + bean.getModel());
		System.out.println("cost is " + bean.getCost());
		
		System.out.println("Driver data\n");
		
		Driver driver = bean.getDriver();
		
		System.out.println("driver id "+driver.getDriverId());
		System.out.println("driver name "+driver.getDriverName());
		System.out.println("driver age "+driver.getDriverAge());
		ctx.close();
	}
}
