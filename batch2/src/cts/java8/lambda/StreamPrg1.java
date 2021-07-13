package cts.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrg1 {

	public static void main(String[] args) {
		Integer ar[] = { 1, 2, 3, 4, 5, 2, 1, 6, 7, 8, 9, 4 };

		Stream.of(ar).forEach(a -> System.out.print(a + " , "));
		System.out.println("\neven elements ");
		Stream.of(ar).filter(a -> (a % 2 == 0)).forEach(a -> System.out.print(a + " , "));
		System.out.println("\nodd elements ");
		Stream.of(ar).filter(a -> (a % 2 != 0)).forEach(a -> System.out.print(a + " , "));
		System.out.println("\ndistinct  elements ");
		Stream.of(ar).distinct().forEach(a -> System.out.print(a + " , "));

		List<String> list1 = new ArrayList<>();
		list1.add("madurai");
		list1.add("chennai");
		list1.add("kanchipuram");
		list1.add("delhi");
		list1.add("mumbai");

		System.out.println("no of elements " + list1.stream().count());
		list1.forEach(p -> System.out.print(p + "  , "));
		list1.stream().forEach(p -> System.out.print(p + "  , "));
		System.out.println("\nlimit  elements ");
		list1.stream().skip(2).forEach(p -> System.out.print(p + "  , "));

		System.out.println("\nskip 2 elements ");
		list1.stream().limit(3).forEach(p -> System.out.print(p + "  , "));

		System.out.println("\nsorted elements ");

		list1.stream().sorted().forEach(p -> System.out.print(p + "  , "));

	}
}
