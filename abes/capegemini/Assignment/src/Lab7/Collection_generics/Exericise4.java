package Lab7.Collection_generics;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exericise4 {

	// arg key regno value marks
	// return key regno value string medal
	static HashMap<Integer, String> countCharacter(HashMap<Integer, Integer> hashmap) {
		HashMap<Integer, String> hashMap1 = new HashMap<>();

		Set<Integer> reg_set = hashmap.keySet();

		String medal = null;
		int marks;
		for (Integer key : reg_set) {
			marks = hashmap.get(key);

			if (marks >= 90)
				medal = "Gold";
			else if (marks >= 80 && marks < 90)
				medal = "Silver";
			else if (marks >= 70 && marks < 80)
				medal = "Bronze";
			
			hashMap1.put(key, medal);
		}
		return hashMap1;
	}

	public static void main(String[] args) {

	}
}
