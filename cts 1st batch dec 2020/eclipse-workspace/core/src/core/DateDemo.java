package core;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.of(1990, 12, 1);
		LocalDate date2=LocalDate.now();
		
		List<LocalDate> dates = date1.datesUntil(date2).collect(Collectors.toList());
		System.out.println("date are "+dates);
		
		//dates.stream().forEach(a->System.out.println(a));
		dates.stream().forEach(System.out::println);
		
		Stream<LocalDate> stream = dates.stream();
		dates.stream().collect(Collectors.toList());
		}
}
