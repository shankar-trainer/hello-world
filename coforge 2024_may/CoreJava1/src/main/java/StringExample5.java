
public class StringExample5 {

	public static void main(String[] args) {

		String var = "we are learning java. with java will also learn spring and spring boot";

		if (var.contains("java"))
			System.out.println("java present at " + var.indexOf("java"));

		if (var.contains("java"))
			System.out.println("java present at " + var.lastIndexOf("java"));

		// contains -- returns boolean
		// indexOf, lastIndexOf returns position

		System.out.println("e present at " + var.indexOf('e'));

		// split -- split the string and return string array using delimiter

		String ar[] = var.split(" "); // delimiter is space
		System.out.println("split method ");
		System.out.println("no of words are " + ar.length);

		for (String string : ar) {
			System.out.println(string);
		}

		String citieslist = "delhi-aagra-mathura-jaipur";

		System.out.println(citieslist + " after split ");

		for (String s : citieslist.split("-"))
			System.out.print(s + ", ");

		citieslist = "delhi-aagra&mathura@jaipur-kolkotta raipur@jabalpur";

		System.out.println("\n multiple delimiter ");
		for (String s : citieslist.split("-|@|&| "))
			System.out.print(s + ", ");

		System.out.println("\n compareTo makes comparison lexicographically");
		System.out.println("delhi".compareTo("delhi"));
		System.out.println("delhi".compareTo("dephi"));
		System.out.println("delhi".compareTo("delei"));
		
	}
}
