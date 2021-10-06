package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
	public static void main(String[] args) {

		String search = "[\\d]{2}";
		// "\\d";
		// "^WE";
		// "1995$";
		// "^WE";
		// "[^0-9a-zA-Z]+";
		// "[0-9a-zA-Z]+";
		// "[^0-9]+";
		// "[A-Z]+";
		// "[a-z]+";
		// "[a-z]";

		Pattern pattern = Pattern.compile(search);

		String var = "WE are learning javaat 100$.we get 10% rebate java is OBJECT oriented language since 1995";

		Matcher matcher = pattern.matcher(var);
		while (matcher.find())
			System.out.println("  " + matcher.start() + "  " + matcher.group());
		// System.out.println(matcher.find() + " " + matcher.start() + " " +
		// matcher.group());
		// System.out.println(matcher.matches());

	}
}
