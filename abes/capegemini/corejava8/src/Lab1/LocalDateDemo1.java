package Lab1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class LocalDateDemo1{

	public static void main(String[] args) {
		String s="1988-02-23";
		
		LocalDate date=LocalDate.parse(s);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s1=date.format(formatter);
		System.out.println(s1);
		
	}
	

}