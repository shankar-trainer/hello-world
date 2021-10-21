import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;

public class DateEx5 {

	public static void main(String[] args) {
		
//		String s="2001-11-20";
//		String s="11-20-2001";
		String s="20-11-2001";
		LocalDate date1=null;
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try{
			
	   date1 = LocalDate.parse(s,formatter);
	   System.out.println("date is "+date1);
		}
		catch (DateTimeParseException e) {
		System.err.println("date not in format  dd-mm-yyyy");
		}
	}
}
