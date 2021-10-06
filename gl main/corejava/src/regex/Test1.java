package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
 
	public static void main(String[] args) {
		String var  
= "we are learning java since july 2019 with amount 200 $. we will learn sql too before 19";
		
		Pattern mypattern = Pattern.compile("^we");
				//("\\s\\d{3}\\s");
				//("\\s[0-9]{3}\\s");
				//("\\s[a-z]{4}\\s");
				//("[^a-zA-Z0-9]");
				//("[0-9]{2}");
				//("[a-z]+");
				//("we");
		Matcher mymatcher = mypattern.matcher(var);
		//System.out.println(mymatcher.find());
		
		while(mymatcher.find())
			System.out.println(mymatcher.group()+" present at   "+mymatcher.start());

	}

}
