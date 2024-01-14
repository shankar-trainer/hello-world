package edu.coforge.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class java8TimePrg1 {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(LocalTime.NOON);

		LocalTime time1 = LocalTime.of(10, 20, 30,45);
		System.out.println(time1);
		
		System.out.println("hh:mm:ss format"+DateTimeFormatter.ofPattern("hh:mm:ss").format(time1));
		
		System.out.println("hh:mm format "+DateTimeFormatter.ofPattern("hh:mm").format(time1));
		
		System.out.println("hh:mm:ss n a format"+DateTimeFormatter.ofPattern("hh:mm:ss:n a").format(time1));		

		LocalTime time2 = time1.plusHours(10);
		System.out.println(time2);
								
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
	}
}
