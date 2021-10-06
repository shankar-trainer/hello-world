package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<>();

		set1.add("book");
		set1.add("shirt");
		set1.add("mobile");
		set1.add("book");
		set1.add("laptop");
		set1.add("bike");
		
		System.out.println(set1);
		
		NavigableSet<String> set2=set1.descendingSet();
		System.out.println(set2);
		
		System.out.println(set2.lower("book"));
		System.out.println(set2.higher("book"));
		
		System.out.println(set2.ceiling("book"));
		System.out.println(set2.floor("book"));
		
		NavigableSet<String> set3=set1.headSet("laptop", false);
		
		NavigableSet<String> set4=set1.tailSet("book", true);
		
		System.out.println(set3);
		System.out.println(set4);
		
		// methods are lower, floor, ceiling, and higher 
	}
	
}
