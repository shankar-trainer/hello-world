package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		
		String search="^dog";
				//"[A-Z]+";
				//"[a-z]+";
				//"[a-z]";
		
		Pattern pattern=Pattern.compile(search);
		
		String var="The quick brown fox jumps over the lazy dog";
		
		Matcher matcher=pattern.matcher(var);
		
		
		while(matcher.find())
			System.out.println(matcher.group()+" search pr at "+matcher.start());
	}
}
