package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<String> language1 = new ArrayList<>();

		language1.add("java");
		language1.add("nodejs");
		language1.add("ruby");
		language1.add("perl");
		language1.add("unix");
		language1.add("php");
		language1.add("reactjs");
		language1.add("angularjs");

		List<String> language2 = new ArrayList<>();

		language2.add("php");
		language2.add("reactjs");
		language2.add("angularjs");
		language2.add("angular8");
		language2.add("backbonejs");

		System.out.println(language2);

		language2.addAll(language1);
		System.out.println(language2);

		// language2.removeAll(language1);

		language2.retainAll(language1);

		System.out.println(language2);

		for (String string : language2) {
			System.out.println(string);
		}
		System.out.println("using Iterator");
		Iterator<String> it = language2.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}
}
