import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date7 {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date );//  date is date + time 
		date=new Date(1);
		System.out.println(date );// date is mutable 
		
		
		//LocalDate date2=new LocalDate(); // error 
		
		LocalDate date2; // immutable 
		
		 date2=LocalDate.of(2009, 12, 30);
		 
		 LocalDate date3=LocalDate.now();
		 System.out.println(date2);
		 System.out.println(date3);
		 
		 LocalTime localTime=LocalTime.now();
		 System.out.println(localTime);
		 System.out.println(LocalTime.NOON);
		 System.out.println(LocalTime.MIDNIGHT);
		 
		 
		 LocalDateTime dateTime=LocalDateTime.of(date3, localTime);
		 
		 
		 
		
	}
}
