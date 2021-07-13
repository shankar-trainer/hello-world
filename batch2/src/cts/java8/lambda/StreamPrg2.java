package cts.java8.lambda;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrg2 {

	public static void main(String[] args) {
		Person person[] = new Person[3];

		person[0] = new Person(788787, "keshav prasad", 12000);
		person[1] = new Person(788781, "sambhu prasad", 11000);
		person[2] = new Person(788790, "mahadev prasad", 18000);

		Stream.of(person).forEach(a -> System.out.println(a.getId() + "  " + a.getName() + " " + a.getSalary()));

		System.out.println("\nsorted by id \n ");
		Stream.of(person).sorted((o1, o2) -> {
			return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
		}).forEach(a -> System.out.println(a.getId() + "  " + a.getName() + " " + a.getSalary()));

		
		List<Person> collect1 = Stream.of(person).collect(Collectors.toList());
		Set<Person> collect2 = Stream.of(person).collect(Collectors.toSet());
		
	}
}
