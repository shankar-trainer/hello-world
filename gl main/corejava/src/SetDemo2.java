import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo2 {
	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<>();

		set1.add("book");
		set1.add("shirt");
		set1.add("mobile");
		set1.add("book");
		set1.add("laptop");
		set1.add("bike");

		System.out.println(set1);

		SortedSet<String> set2 = set1.subSet("book", "shirt");

		System.out.println(set2);

		SortedSet<String> set3 = set1.headSet("laptop");
		System.out.println(set3);

		SortedSet<String> set4 = set1.tailSet("book");
		System.out.println(set4);
		
		 
		

	}
}
