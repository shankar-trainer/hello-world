import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateEx6 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate date1=LocalDate.of(2011,11,30);
		
		long months = date1.until(date,ChronoUnit.MONTHS);
		long days = date1.until(date,ChronoUnit.DAYS);
		long years = date1.until(date,ChronoUnit.YEARS);
		System.out.println(days+"  days  "+months+"  months "+years+"  years");
		
		Period period=Period.between(date1,date);
		System.out.println(period);
		
		/*
		 * 
3220  105  8

P8Y9M24D
		 * 
		 */
		
	}
}
