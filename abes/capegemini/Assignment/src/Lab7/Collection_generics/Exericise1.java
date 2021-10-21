package Lab7.Collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Exericise1 {

	static List<String> getValues(HashMap<Integer, String> hashMap) {

		Collection<String> list1 = hashMap.values();
	
		List<String> list2 = new ArrayList<String>();
		
		for (String string : list1) {
		  list2.add(string)	;
		}
		Collections.sort(list2);
		return list2;
	}

	public static void main(String[] args) {
		String ar[] = { "delhi", "chennai", "jaipur", "mumbai", "bulandsahar" };

		HashMap<Integer, String> hashMap1 = new HashMap<>();

		Random randome = new Random();

		for (int i = 0; i < ar.length; i++)
			hashMap1.put(randome.nextInt(), ar[i]);

		List<String> mylist = getValues(hashMap1);
		System.out.println(mylist);
	}
}
