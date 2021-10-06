package collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class mapDemo1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<>();
		// HashMap<>();
		// Hashtable<>();

		map1.put(9004, "mobile");
		map1.put(9001, "book");

		map1.put(100, "PC");
		map1.put(1001, "laptop");
		map1.put(9007, "perfume");

		map1.put(100, "HP PC");

		System.out.println(map1);

		NavigableMap<Integer, String> map2 = map1.descendingMap();

		System.out.println(map2);

		NavigableMap<Integer, String> map3 = map2.headMap(9001, true);
		System.out.println(map3);

		SortedMap<Integer, String> map4 = map1.headMap(9001);
		System.out.println(map4);
	}
}
