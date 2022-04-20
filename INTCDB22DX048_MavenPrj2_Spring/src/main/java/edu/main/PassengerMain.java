package edu.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Passenger;

public class PassengerMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Passenger passenger1 = ctx.getBean(Passenger.class);

		System.out.println(passenger1.getPassengerId());
		System.out.println(passenger1.getPassengerName());
		System.out.println(passenger1.getPassengerAge());
		System.out.println(passenger1.getPlacesList());
		List<String> placesList = passenger1.getPlacesList();
		for (String s : placesList)
			System.out.println("\t" + s);
		System.out.println("\njava8 foreach method\n");
		placesList.forEach(a -> System.out.println("\t"+a));

		System.out.println("\n all car list ");
      passenger1.getCarSet().forEach(a->System.out.println(a.getRegNo()+"\t"+a.getCarModel()+"\t"+a.getCost()));		
	}

}
