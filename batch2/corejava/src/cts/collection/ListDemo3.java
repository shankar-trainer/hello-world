package cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List<String> language1 = new ArrayList<>();

		language1.add("java");
		language1.add("php");
		language1.add("python");
		language1.add("jython");

		List<String> language2 = new ArrayList<>();

		language2.add("nodejs");
		language2.add("php");
		language2.add("dotnet");
		language2.add("android");
		language2.add("java");

		language1.addAll(language2);

		System.out.println(language1.contains("php"));

		System.out.println(language1.containsAll(language2));
		//language1.retainAll(language2);
		System.out.println("after retain all "+language1);
		
		System.out.println(language1.removeAll(language2));
		System.out.println(language1);
		

	}
}
