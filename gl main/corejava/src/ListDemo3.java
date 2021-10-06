import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		String capital[] = { "new delhi", "dhaka", "sanghai", "kathmandu", "colombo", "dhaka" };
		List<String> mycapital = new ArrayList<>();

		/*
		 * for (String string : capital) { mycapital.add(string); }
		 */

		mycapital = Arrays.asList(capital);

		System.out.println(mycapital);

		Collections.sort(mycapital);
		System.out.println(mycapital);
		System.out.println(Collections.binarySearch(mycapital, "dhaka"));

		// Collections.shuffle(mycapital);
		// System.out.println(mycapital);
		System.out.println(Collections.max(mycapital));
		System.out.println(Collections.min(mycapital));

		System.out.println(Collections.frequency(mycapital, "dhaka"));
	}
}
