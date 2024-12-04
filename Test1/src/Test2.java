import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		LocalDate date2; // immutable 
		
		 date2=LocalDate.of(2009, 12, 30);
		
		 System.out.println(date2);
		 
		 DateTimeFormatter  dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 
		 String format = date2.format(dateTimeFormatter);
		 System.out.println(format);
		 
		 System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy  EEEE")));
		 System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy  EEEE G")));
		 
		 // E week day 
		 
		 date2.plusDays(12);
		 
	}
}
