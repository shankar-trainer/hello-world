package Lab7.Collection_generics;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Exericise2 {

	static HashMap<Character, Integer> countCharacter(Character ar[]) {

		HashMap<Character, Integer> hashMap = new HashMap<>();

		List<Character> list1 = Arrays.asList(ar);

		int c = 0;
		for (Character character : list1) {
			c = 0;
			c = Collections.frequency(list1, character);
			hashMap.put(character, c);
		}
		return hashMap;
	}

	public static void main(String[] args) {

		Character character[]= {'a','b','a','d','b','c','e','a','d'};
		
		System.out.println(countCharacter(character));
		
	}
}
