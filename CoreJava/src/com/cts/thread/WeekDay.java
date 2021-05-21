package com.cts.thread;

enum Day {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class WeekDay {

	enum Booking {
		booked(11),
		notBooked(22);
		
		int val;

		Booking(int val) {
			this.val = val;
		}		
	}

		public static void main(String[] args) {

			System.out.println("week day " + Day.Sunday);
			System.out.println("week day " + Day.Saturday);
			
			System.out.println(Booking.booked);
			System.out.println(Booking.notBooked);
			

		}

}
