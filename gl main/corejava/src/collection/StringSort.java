package collection;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

	static class StringReverse implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	}

	public static void main(String[] args) {
		
		String name[]={"john","may","bob"};
		
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		System.out.println(String.join(" ", name));
		
		Arrays.sort(name, new StringReverse());
		System.out.println(Arrays.toString(name));
	}
}
