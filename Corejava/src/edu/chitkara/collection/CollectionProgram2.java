package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionProgram2 {

	public static void main(String[] args) {
		// List<String> language=new ArrayList<String>();
		List<String> language = new Vector<String>();

		// language.add(454554);// error
		language.add("java");
		language.add("python");
		language.add("php");
		language.add("java");
		language.add("node");
		language.add("javascript");

		System.out.println(language);
		System.out.println(language.get(0));
		System.out.println(language.get(1));
		System.out.println(language.get(2)); // get using index

		language.remove(5);
		// remove using index or object
		language.remove("php");
		System.out.println(language);

		System.out.println("using get and for loop");
		for (int i = 0; i < language.size(); i++) {
			System.out.print(language.get(i) + ", ");
		}

		System.out.println("\n\nusing  for each  loop");
		for (String string : language) {
			System.out.print(string + ",");
		}

	}
}
