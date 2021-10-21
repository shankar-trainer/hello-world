import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateEx3 {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern
				//("dd-MM-yyyy  G");
				//("dd-MMM-yyyy  G");
				("dd-MMMM-yyyy  EEEE G");
	                 // E for week day   Tue, EEEE Tuesday
		             //MM -month - 09 MMM-Sep, MMMM September
		 
		System.out.println("date is dd-mm-yyyy format "+formatter.format(date1));
	
		LocalTime localTime=LocalTime.now();
		
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("hh:mm:ss A");
		
		System.out.println(localTime);
		System.out.println(formatter1.format(localTime));
		 formatter1=DateTimeFormatter.ofPattern("HH:mm:ss n a ");
		 System.out.println(formatter1.format(localTime));
		 
		 
		 
		
		
	}
}
