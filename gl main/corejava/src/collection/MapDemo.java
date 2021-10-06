package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new TreeMap<>();
		// HashMap<>();
		// Hashtable<>();

		map1.put(9004, "mobile");
		map1.put(9001, "book");

		map1.put(100, "PC");
		map1.put(1001, "laptop");
		map1.put(9007, "perfume");

		map1.put(100, "HP PC");

		System.out.println(map1);

		System.out.println("100n values " + map1.get(100));

		Set<Integer> keyset = map1.keySet();

		for (Integer integer : keyset) {
			System.out.println(integer + "-->" + map1.get(integer));
		}

		Iterator<Integer> iterator = keyset.iterator();

		System.out.println("using iterator");
		for (; iterator.hasNext();)
		// while(iterator.hasNext())
		{
			Integer integer = iterator.next();
			System.out.println(integer + "-->" + map1.get(integer));
		}

	}
}
