import java.time.LocalDate;
import java.time.Period;

public class DateEx2 {

	public static void main(String[] args) {
		LocalDate date2 = LocalDate.of(1990, 12, 30);
		System.out.println(date2);

		Period periodof10days = Period.ofDays(10);
		date2 = date2.plus(periodof10days);

		System.out.println(date2);

		LocalDate date1 = LocalDate.now();
		System.out.println(date1);

		Period period1 = Period.between(date2, date1);

		 System.out.println(period1);

		System.out.println(period1.getDays());

	}
}
