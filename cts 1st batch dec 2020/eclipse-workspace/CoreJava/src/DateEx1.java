import java.time.LocalDate;
import java.time.LocalTime;

public class DateEx1 {

	public static void main(String[] args) {
		
		//LocalDate date=new LocalDate();
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate date2=LocalDate.of(1990, 12,30);
		System.out.println(date2);
		
	date2=	date2.plusYears(10);
		
		System.out.println(date2);
		
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		LocalTime localTime1=LocalTime.of(12, 30);
		
		System.out.println(localTime1);
		
		localTime1= localTime1.plusHours(10);
		
		System.out.println(localTime1);
		
		
		
	}
}
