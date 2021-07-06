package cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
//		List<String> language1=new ArrayList<String>();
		List<String> language1=new ArrayList<>();
		
		language1.add("java");
		language1.add("php");
		language1.add("python");
		language1.add("jython");
		language1.add("nodejs");
		language1.add("dotnet");
		
		System.out.println(language1);
		
		System.out.println("using  for loop ");
		
		language1.remove(0);
		language1.remove("jython");
		
		for (int i = 0; i < language1.size(); i++) {
			System.out.print(language1.get(i)+" , ");
		}
		
		System.out.println("\n----- using for each  ");
		//Iterable i;
		
		for (String string : language1) {
			System.out.print(string+"     , ");
		}
		
		language1.clear();
		System.out.println("\nafter clear "+language1);
	}
}
