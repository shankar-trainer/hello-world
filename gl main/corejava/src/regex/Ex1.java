package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		
		String search="[^0-9a-zA-Z]+";
				//"[0-9a-zA-Z]+";
		
				//"[^0-9]+";
				//"[A-Z]+";
				//"[a-z]+";
				//"[a-z]";
		
		Pattern pattern=Pattern.compile(search);
		
		String var="WE are learning javaat 100$.we get 10% rebate java is OBJECT oriented language since 1995";
		
		Matcher matcher=pattern.matcher(var);
		
		//System.out.println(matcher.find());
		
		while(matcher.find())
			System.out.println(matcher.group());
			//System.out.println(matcher.group()+" search pr at "+matcher.start());

		var.matches("[]");
		
	}
}
