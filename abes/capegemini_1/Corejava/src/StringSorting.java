public class StringSorting {

	public static void main(String[] args) {

		String city[] = { "delhi", "kolkotta", "banglore", "chennai", "mumbai" };

		String temp;

		for (int i = 0; i < city.length; i++) {
			for (int j = i+1; j < city.length; j++) {

				if (city[i].compareTo(city[j]) > 0) {
					temp = city[i];
					city[i] = city[j];
					city[j] = temp;
				}
			}
		}

		for (String string : city) {
			System.out.print(string+" ");
		}
	}

}
