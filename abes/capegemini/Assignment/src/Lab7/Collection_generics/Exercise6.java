package Lab7.Collection_generics;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Exercise6 {

	static List<Integer> voterList(HashMap<Integer, LocalDate> hashMap) {
		Set<Integer> set1 = hashMap.keySet();
		LocalDate localDate = null;
		LocalDate date = LocalDate.now();

		List<Integer> list1 = new ArrayList<Integer>();

		for (Integer integer : set1) {
			localDate = hashMap.get(integer);

			int year = Period.between(localDate, date).getYears();

			if (year >= 18)
				list1.add(integer);
		}
		return list1;
	}

	public static void main(String[] args) {
    
		HashMap<Integer, LocalDate> hashMap=new HashMap<>();
		
		hashMap.put(1001, LocalDate.of(2000, 1, 11));
		hashMap.put(1002, LocalDate.of(2001, 1, 21));
		hashMap.put(1003, LocalDate.of(2002, 1, 10));
		hashMap.put(1004, LocalDate.of(2003, 1, 14));
		hashMap.put(1005, LocalDate.of(2001, 12, 1));
		
		System.out.println(voterList(hashMap));
	}
}
