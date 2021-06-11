package com.cts.inner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonMain {
	public static void main(String[] args) {
		Person person[] = new Person[3];

		person[0] = new Person(7667676, "suman kumar", 12000);
		person[1] = new Person(7667671, "pradip kumar", 11000);
		person[2] = new Person(7667672, "chandrkant kumar", 15000);

		Arrays.sort(person, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		System.out.println("sorted by name ");

		Stream.of(person).forEach(a -> System.out.println(a));

		System.out.println("first record");
		Optional<Person> findFirst = Stream.of(person).findFirst();
		
		if(findFirst.isPresent())
			System.out.println(findFirst.get());
		
		System.out.println("person having salary geater than 12000 using filter");
		Stream.of(person).filter(a->a.getIncomeAmt()>=12000).forEach(a -> System.out.println(a));
		
		Set<Person> collect = Stream.of(person).filter(a->a.getIncomeAmt()>=12000).collect(Collectors.toSet());
		
		
		
	}

}
